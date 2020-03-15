package com.javaspring.security.api;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GitDemoApplicationTests {
	
	public static final Logger logger=LoggerFactory.getLogger(GitDemoApplicationTests.class);
	

	@Test
	void contextLoads() {
		logger.info("hello test");
	}

}
