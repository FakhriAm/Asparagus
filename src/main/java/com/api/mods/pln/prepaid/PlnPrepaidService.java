
package com.api.mods.pln.prepaid;

import com.util.AsparagusService;
import java.util.Map;
import org.apache.log4j.Logger;
import spark.Request;

public class PlnPrepaidService extends AsparagusService {
    
    private static Logger logger = Logger.getLogger(PlnPrepaidService.class);

    public String process(String output, String trx_id, String prod_id, String trx_type, String format, Map mrx, Request request) {
        String result = "";
        
        logger.info("-= PLN Prepaid Service =-");
        
        PlnPrepaidFormatter preFormat = new PlnPrepaidFormatter();
        if (trx_type.equalsIgnoreCase("2100")) {                
            result = preFormat.inquiry(output, trx_id, prod_id, trx_type, format);
        }
        else if (trx_type.equalsIgnoreCase("2200")) {
            result = preFormat.payment(output, trx_id, prod_id, trx_type, format);
        }
        
        return result;        
    }
}
