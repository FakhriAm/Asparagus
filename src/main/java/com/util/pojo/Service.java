
package com.util.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="servicex")
public class Service {
    
    @XmlAttribute
    protected String name;

    @XmlAttribute
    protected String processor;
    
    @XmlAttribute
    protected String product;
    
    @XmlAttribute
    protected String format;
    
    protected RainbowQ rainbowq;
    
    /*
    private String servicex;
    
    public String getServicex() {
        return servicex;
    }
    @XmlElement(name="servicex")
    public void setService(String servicex) {
        this.servicex = servicex;
    }*/
    
    @XmlElement(name="rainbowq")
    public RainbowQ getRainbowQ() {
        return rainbowq;
    }

    public void setRainbowQ(RainbowQ rainbowq) {
        this.rainbowq = rainbowq;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
    
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
    
}
