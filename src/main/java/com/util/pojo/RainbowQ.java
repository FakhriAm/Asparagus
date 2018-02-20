/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util.pojo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
/**
 *
 * @author root
 */
@XmlRootElement(name="rainbowq")
public class RainbowQ {

    private String queue_name;
    private String task_queue_name;
    private String exchange_name;
    private String routing_key;
    
    
    public String getTaskQueueName() {
        return task_queue_name;
    }
    @XmlElement(name="task_queue_name")
    public void setTaskQueueName(String task_queue_name) {
        this.task_queue_name = task_queue_name;
    }
    
    public String getExchangeName() {
        return exchange_name;
    }
    @XmlElement(name="exchange_name")
    public void setExchangeName(String exchange_name) {
        this.exchange_name = exchange_name;
    }
    
    public String getRoutingKey() {
        return routing_key;
    }
    @XmlElement(name="routing_key")
    public void setRoutingKey(String routing_key) {
        this.routing_key = routing_key;
    }
    
}
