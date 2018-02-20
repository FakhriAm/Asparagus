
package com.util.pojo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
/**
 *
 * @author root
 */
@XmlRootElement(name="transactions_response")
public class TransactionsResponseGagal {
    
    private DataGagal data= null;
    
   
    public DataGagal getData() {
        return data;
    }
    @XmlElement
    public void setData(DataGagal data) {
        this.data = data;
    }
    
    
    
}
