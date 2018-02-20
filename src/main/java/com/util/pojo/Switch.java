
package com.util.pojo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="switch")
public class Switch {
    private List<Service> servicex;
    
    public List<Service> getServicex() {
        if( servicex == null ){
          servicex = new ArrayList<>();
        }
        return servicex;
    }
    
    @XmlElement(name="servicex")
    public void setServicex(List<Service> servicex) {
        this.servicex = servicex;
    }
}
