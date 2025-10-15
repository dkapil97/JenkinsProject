package com.kd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsProjectApplication {
	
	public static Logger logger=LoggerFactory.getLogger(JenkinsProjectApplication.class);
	
	@PostConstruct
	public  void initi() {
		logger.info("Application is Started..!");
	}
	
	public static void main(String[] args) {
		logger.info("Application is executed...!");
		SpringApplication.run(JenkinsProjectApplication.class, args);
	}

}
