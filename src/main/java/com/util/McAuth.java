
package com.util;

import com.api.Asparagus;
import com.util.pojo.Settings;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import model.Users;
import net.spy.memcached.MemcachedClient;
import org.apache.log4j.Logger;
import spark.Request;
import spark.Response;

public class McAuth {
   
    private static Logger logger = Logger.getLogger(McAuth.class);
    private static MemcachedClient mc = null;
    
    public McAuth() {
        
    }
    
    public McAuth(MemcachedClient mc) {
        this.mc = mc;
    }
    
    public int CakeRESTAuth(Request request,Response response) {
        
        int user_idx = 0;
        String username = "";
        String password = "";
        String signature = "";
        
        try {
        //get authentication info
        logger.info("Authorization => "+request.headers("Authorization"));
        String header = request.headers("Authorization");
        header = header.replaceAll("PELANGIREST ", "");
        logger.info("Header : "+header);
        String header_info[] = header.split("&");
        header_info[0] = header_info[0].replaceAll("username=","");
        username = header_info[0];
        Asparagus plg = new Asparagus();
        plg.setUserx(username);
        logger.info("Username  : "+header_info[0]);
        header_info[1] = header_info[1].replaceAll("password=","");
        password = header_info[1];
        logger.info("Password  : "+header_info[1]);
        header_info[2] = header_info[2].replaceAll("signature=","");
        signature = header_info[2];
        logger.info("Signature : "+header_info[2].replaceAll("signature=",""));
        

        //cek users auth info
        String salt = "";
        try {

            //File file = new File(plg.classLoader.getResource("settings.xml").getFile());
            File file = new File("config/settings.xml");

            JAXBContext jaxbContext = JAXBContext.newInstance(Settings.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Settings settingx = (Settings) jaxbUnmarshaller.unmarshal(file);

            salt = settingx.getSalt();
            logger.info("Salt       : "+settingx.getSalt());

        }
        catch(Exception e) {
            e.printStackTrace();
        }

        List<String> datas = new ArrayList<String>();
//        user_idx = isAuthenticated(header_info[0],convertSHA1(salt+header_info[1]));
        datas = isAuthenticated(header_info[0],convertSHA1(salt+header_info[1]));
        String userIds = datas.get(0);
        String secret_key = datas.get(1);
                
        String prodIdBody = request.queryParams("product_id");
        String dateBody = request.queryParams("trx_date");
        String signBody = request.queryParams("signature");
        
        String newSign = MD5(username+password+prodIdBody+dateBody+secret_key);
        
        logger.info("Signature Cek: "+newSign);
        
        logger.info("Params data : ");
        logger.info("prodIdBody : "+prodIdBody);
        logger.info("dateBody : "+dateBody);
        logger.info("secret_key : "+secret_key);
        
        if(newSign.equals(signature)){
            logger.info("Signature header dan generate Sama,, request Valid ");
            user_idx = Integer.parseInt(userIds);
        }else{
            logger.info("Signature header dan generate Beda,, request Invalid Signature ");
            user_idx = 0;
        }
        
        plg.setUid(user_idx);
        
        }
        catch(Exception e) {
            e.printStackTrace();
            logger.fatal(e.toString());
        }

        return user_idx;
    }
    
    public static String convertSHA1(String x) throws NoSuchAlgorithmException {
        String result = "";

        MessageDigest md = MessageDigest.getInstance("SHA-1");
        md.update(x.getBytes());
 
        byte byteData[] = md.digest();
 
        //convert the byte to hex format method 1
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
         sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }
 
        //System.out.println("sig:: " + sb.toString());
        result = sb.toString();
        return result;
    }
    
    
//    private int isAuthenticated(String username, String password) {
//        int result = 0;
//        
//        try {
//            logger.info("Username : "+username+" Password : "+password);
//                logger.info("username get : "+mc.get("user_"+username).toString());
//                logger.info("pasw get : "+mc.get("user_"+username+"_id").toString());
//            if (password.equalsIgnoreCase(mc.get("user_"+username).toString())){
//                result = Integer.parseInt(mc.get("user_"+username+"_id").toString());
//                logger.info("UID : "+result);
//            }
//            
//        }
//        catch(Exception e) {
//            e.printStackTrace();
//            logger.fatal(e.toString());
//        }
//        finally {
//            
//        }
//        
//        return result;
//    }
    
    private List<String> isAuthenticated(String username, String password) {
        List<String> result = new ArrayList<String>();

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("API", System.getProperties());
        EntityManager em = factory.createEntityManager();
        try {
            logger.info("Username : "+username+" Password : "+password);
            String sql = "SELECT o FROM Users o where o.username =:user and o.password=:pass";
            Query query = em.createQuery(sql);
            query.setParameter("user",username);
            query.setParameter("pass",password);
            query.setMaxResults(1);

            for (Users m : (List<Users>) query.getResultList()) {
                result.add(""+m.getId());
                result.add(""+m.getSecretKey());
            }
                      
            em.close();
            factory.close();
        }
        catch(Exception e) {
            logger.fatal(e.toString());
        }
        finally {
            
            if (em.isOpen()) {
                em.close();                
            }
            
            if (factory.isOpen()) {
                factory.close();
            }
            
        }
        
        return result;
    }

    
    public String MD5(String md5) {
       try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] array = md.digest(md5.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
              sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
           }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
        }
        return null;
    }
            
}
