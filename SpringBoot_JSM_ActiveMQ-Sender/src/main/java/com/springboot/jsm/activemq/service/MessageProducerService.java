package com.springboot.jsm.activemq.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class MessageProducerService {


    Employee employee= new Employee("John", "Hagen");

//    Converting to JSON
    ObjectMapper obectMapper = new ObjectMapper();
    String message= obectMapper.writeValueAsString(employee);

    JmsTemplate jmsTemplate;

    @Autowired
    public MessageProducerService(JmsTemplate jmsTemplate) throws Exception {
        this.jmsTemplate = jmsTemplate;
    }

    public void sendMessage() {
    jmsTemplate.convertAndSend("queue1",message);
    }

}
