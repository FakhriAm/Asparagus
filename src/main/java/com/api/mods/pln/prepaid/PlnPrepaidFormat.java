
package com.api.mods.pln.prepaid;

import com.util.InternalMessageFormat;
import java.util.Map;
import org.apache.log4j.Logger;
import spark.Request;

public class PlnPrepaidFormat extends InternalMessageFormat {
    
    private static Logger logger = Logger.getLogger(PlnPrepaidFormat.class);
    
    public String getFormat(String[] reqParams, Map mrx, Request request, int user_id) {
        String inbox_message = "";
        String trx_id = reqParams[1];
        String cust_account_no = reqParams[2];
        String product_id = reqParams[3];
        String cust_msisdn = reqParams[4];
        String product_nomination = reqParams[5];
        String trx_type = reqParams[6];
        String trx_date = reqParams[7];
        
        if (trx_type.equalsIgnoreCase("2100")){            
            inbox_message = "cek.pln."+cust_account_no+".1234";
        }
        else if (trx_type.equalsIgnoreCase("2200")){                
            inbox_message = "token.pln"+product_nomination+"."+cust_account_no+".1234."+trx_id;
        }
        logger.info("inbox message : "+inbox_message);
        
        return inbox_message;
    }
    
}
