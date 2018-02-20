package com.util;

import com.rabbitmq.client.*;
import com.rabbitmq.client.AMQP.BasicProperties;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

public class RPCClient {

  private static Logger logger = Logger.getLogger(RPCClient.class);

  private Connection connection;
  private Channel channel;
  private String requestQueueName = "rpc_queue";
  private String replyQueueName;
//  private QueueingConsumer consumer;

  public RPCClient() throws Exception {
    ConnectionFactory factory = new ConnectionFactory();
    factory.setHost("localhost");
    connection = factory.newConnection();
    channel = connection.createChannel();

    replyQueueName = channel.queueDeclare().getQueue();
//    consumer = new QueueingConsumer(channel);
//    channel.basicConsume(replyQueueName, true, consumer);
  }

  public String call(String idx) throws Exception {
              
    String responsex = null;
    String corrId = idx;

    BasicProperties props = new BasicProperties
                                .Builder()
                                .correlationId(corrId)
                                .replyTo(replyQueueName)
                                .build();

    channel.basicPublish("", requestQueueName, props, corrId.getBytes("UTF-8"));
    
    final BlockingQueue<String> response = new ArrayBlockingQueue<String>(1);
    
    logger.info("Waiting response for #"+idx);
    channel.basicConsume(replyQueueName, true, new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                if (properties.getCorrelationId().equals(corrId)) {
                    response.offer(new String(body, "UTF-8"));
                }
            }
        });

//    
//    while (true) {
////      QueueingConsumer.Delivery delivery = consumer.nextDelivery();
//      if (delivery.getProperties().getCorrelationId().equals(corrId)) {
//        responsex = new String(delivery.getBody(),"UTF-8");
//        break;
//      }
//    }

    return response.take();
  }

  public void close() throws Exception {
    connection.close();
  }

}