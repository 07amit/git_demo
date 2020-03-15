package com.javaspring.security.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication {
	public static final Logger LOGGER=LoggerFactory.getLogger(GitDemoApplication.class);

	public static void main(String[] args) {
		LOGGER.info("hello Logger...");
		SpringApplication.run(GitDemoApplication.class, args);
	}

}
