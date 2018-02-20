
package com.api.mods.pln.prepaid;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author root
 */
@XmlRootElement(name="data")
public class DataPrepaidPurchase {
    
    TrxPlnPrepaidPurchase trx = null;

    public TrxPlnPrepaidPurchase getTrx() {
        return trx;
    }
    @XmlElement(name="trx")
    public void setTrx(TrxPlnPrepaidPurchase trxs) {
        this.trx = trxs;
    }


}
