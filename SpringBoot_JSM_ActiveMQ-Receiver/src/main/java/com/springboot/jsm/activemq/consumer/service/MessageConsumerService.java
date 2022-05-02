package com.springboot.jsm.activemq.consumer.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;


@Component
public class MessageConsumerService {

    ObjectMapper objectMapper= new ObjectMapper();

//    Receiving message
    @JmsListener(destination = "queue1")
    public void listener(String message) throws Exception {
        Employee employee= objectMapper.readValue(message,Employee.class);
        System.out.println("Message received in Queue1: "+employee);
    }

}
