
package com.util.pojo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author root
 */
@XmlRootElement(name="trx")
public class TrxGagal {
    
    String trx_id;
    String rc;
    String status;
    String saldo;
    String desc;
    

    public String getTrx_id() {
            return trx_id;
    }

    @XmlElement(name="trx_id")
    public void setTrx_id(String trx_id) {
            this.trx_id = trx_id;
    }

    public String getRc() {
            return rc;
    }

    @XmlElement(name="rc")
    public void setRc(String rc) {
            this.rc = rc;
    }

    public String getStatus() {
            return status;
    }

    @XmlElement(name="status")
    public void setStatus(String status) {
            this.status = status;
    }
    
    
    public String getSaldo() {
            return saldo;
    }

    @XmlElement(name="saldo")
    public void setSaldo(String saldo) {
            this.saldo = saldo;
    }
    
    public String getDesc() {
            return desc;
    }

    @XmlElement(name="desc")
    public void setDesc(String desc) {
            this.desc = desc;
    }
    
}

