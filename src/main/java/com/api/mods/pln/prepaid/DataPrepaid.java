
package com.api.mods.pln.prepaid;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author root
 */
@XmlRootElement(name="data")
public class DataPrepaid {
    
    TrxPlnPrepaid trx = null;

    public TrxPlnPrepaid getTrx() {
        return trx;
    }
    @XmlElement(name="trx")
    public void setTrx(TrxPlnPrepaid trxs) {
        this.trx = trxs;
    }


}
