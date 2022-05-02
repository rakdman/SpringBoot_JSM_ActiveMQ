package com.springboot.jsm.activemq.controller;

import com.springboot.jsm.activemq.service.MessageProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageProducer {

    @Autowired
    MessageProducerService messageProducerService;

    @GetMapping("/sendmessage")
    public String produceMessage() {
        messageProducerService.sendMessage();
        return "Message sent successfully!";
    }

}
