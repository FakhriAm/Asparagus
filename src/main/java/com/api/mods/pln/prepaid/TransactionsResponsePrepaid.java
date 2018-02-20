
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
public class TransactionsResponsePrepaid {
    
    private DataPrepaid data= null;
    
   
    public DataPrepaid getData() {
        return data;
    }
    @XmlElement
    public void setData(DataPrepaid data) {
        this.data = data;
    }
    
    
    
}
