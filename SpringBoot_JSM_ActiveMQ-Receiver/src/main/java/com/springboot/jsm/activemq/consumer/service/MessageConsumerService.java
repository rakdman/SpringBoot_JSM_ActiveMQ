package com.springboot.jsm.activemq.consumer.service;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;


@Component
public class MessageConsumerService {



    @JmsListener(destination = "queue1")
    public void listener(String message) {
        System.out.println("Message received in Queue1: "+message);
    }

}
