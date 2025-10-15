package com.kd;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsProjectApplicationTests {

	public static Logger logger=LoggerFactory.getLogger(JenkinsProjectApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("test case executed..!");
		logger.info("Test case executing second log statement");
		
		
		assertWith(true, true);
	}

	private void assertWith(boolean b, boolean c) {
		// TODO Auto-generated method stub
		
	}

}
