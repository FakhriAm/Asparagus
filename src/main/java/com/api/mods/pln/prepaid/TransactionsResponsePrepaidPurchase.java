
package com.api.mods.pln.prepaid;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
/**
 *
 * @author root
 */
@XmlRootElement(name="transactions_response")
public class TransactionsResponsePrepaidPurchase {
    
    private DataPrepaidPurchase data= null;
    
   
    public DataPrepaidPurchase getData() {
        return data;
    }
    @XmlElement
    public void setData(DataPrepaidPurchase data) {
        this.data = data;
    }
    
    
    
}
