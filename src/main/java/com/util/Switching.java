
package com.util;

import com.api.Asparagus;
import static com.api.Asparagus.mpx;
import com.util.pojo.Service;
import com.util.pojo.Switch;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import org.apache.log4j.Logger;
import spark.Request;


public class Switching {
    
    private static Logger logger = Logger.getLogger(Switching.class);
    
    public Switching(){
        
    }
    
    public static void serviceMapping() {
        
        try {
            File file = new File("config/switch.xml");
        
            JAXBContext jaxbContext = JAXBContext.newInstance(Switch.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Switch switchx = (Switch) jaxbUnmarshaller.unmarshal(file);

            List <Service> serviceMap = switchx.getServicex();
            Iterator<Service> iterator = serviceMap.iterator();

            while (iterator.hasNext()) {
                Service serv = iterator.next();
                logger.info(serv.getProcessor());
                logger.info(serv.getName());
                logger.info(serv.getProduct());
                logger.info(serv.getFormat());
                logger.info(serv.getRainbowQ().getTaskQueueName());
                logger.info(serv.getRainbowQ().getExchangeName());
                logger.info(serv.getRainbowQ().getRoutingKey());
                logger.info("================");
                
                //put into map
                mpx.put(serv.getProduct()+"_class", serv.getProcessor());
                mpx.put(serv.getProduct()+"_format", serv.getFormat());
                mpx.put(serv.getProduct()+"_queue", serv.getRainbowQ().getTaskQueueName());
                mpx.put(serv.getProduct()+"_exchange", serv.getRainbowQ().getExchangeName());
                mpx.put(serv.getProduct()+"_route", serv.getRainbowQ().getRoutingKey());
                
            }
            System.out.println();
            System.out.println(" Map Elements");
            System.out.print("\t" + mpx);
            
        }
        catch(Exception e) {
            e.printStackTrace();
            
        }
    }
    
    public static String getInternalMessageFormat(String[] reqParams, Map mrx, Request request, int user_id) {
        String result = "";
        
        ClassLoader classLoader = Asparagus.class.getClassLoader();

        try {
            String prod_id = reqParams[3];
            logger.info("prod_id = " + prod_id);
            
            Class ngeload = classLoader.loadClass(mrx.get(prod_id+"_format").toString());
            logger.info("format nya = " + ngeload.getName());
            
            Constructor constructor = ngeload.getConstructor();
	    Object obj = constructor.newInstance();
            
            Class x = Class.forName(mrx.get(prod_id+"_format").toString());
            InternalMessageFormat ps = (InternalMessageFormat)x.newInstance();
            
            result = ps.getFormat(reqParams,mrx, request, user_id);
            
        } catch (Exception e) {
            e.printStackTrace();
            logger.fatal(e.toString());
        }
        
        return result;
    }
    
    public static String processMessage(String output, String trx_id, String prod_id, String trx_type, String format, Map mrx, Request request){
        String result = "";
        
        ClassLoader classLoader = Asparagus.class.getClassLoader();

        try {
            Class ngeload = classLoader.loadClass(mrx.get(prod_id+"_class").toString());
            logger.info("nama kelas = " + ngeload.getName());
            
            Constructor constructor = ngeload.getConstructor();
	    Object obj = constructor.newInstance();
            
            Class x = Class.forName(mrx.get(prod_id+"_class").toString());
            AsparagusService ps = (AsparagusService)x.newInstance();
            
            result = ps.process(output, trx_id, prod_id, trx_type, format,mrx, request);
            
        } catch (Exception e) {
            e.printStackTrace();
            logger.fatal(e.toString());
        }
        
             
        
        return result;
    }
    
}
