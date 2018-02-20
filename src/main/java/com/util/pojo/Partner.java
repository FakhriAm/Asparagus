
package com.util.pojo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="partner")
public class Partner {
    
    String name;
    String uid;
    String ip;
    
    public String getName() {
        return name;
    }
    
    @XmlElement(name="name")
    public void setName(String name) {
        this.name = name;
    }
    
    public String getUid() {
        return uid;
    }
    
    @XmlElement(name="uid")
    public void setUid(String uid) {
        this.uid = uid;
    }
    
    public String getIp() {
        return ip;
    }
    
    @XmlElement(name="ip")
    public void setIp(String ip) {
        this.ip = ip;
    }
    
}
