
package com.util.pojo;

import com.util.pojo.Partner;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author root
 */
@XmlRootElement(name="whitelist")
public class Whitelist {
    private List<Partner> partner;
    
    public List<Partner> getPartner() {
        if( partner == null ){
          partner = new ArrayList<>();
        }
        return partner;
    }
    
    @XmlElement(name="partner")
    public void setPartner(List<Partner> partner) {
        this.partner = partner;
    }
}
