package com.springboot.jsm.activemq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SpringBootJMSApplicationSender {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJMSApplicationSender.class, args);
	}

}
