package com.springboot.jsm.activemq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SpringBootJMSApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJMSApplication.class, args);
	}

}
