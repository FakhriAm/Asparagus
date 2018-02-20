
package com.util.pojo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author root
 */
@XmlRootElement(name="data")
public class DataGagal {
    
    TrxGagal trx = null;

    public TrxGagal getTrx() {
        return trx;
    }
    @XmlElement(name="trx")
    public void setTrx(TrxGagal trxs) {
        this.trx = trxs;
    }


}
