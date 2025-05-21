package com.javatechiee.jenkins.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringJenkiiiApplicationTests {
	public static org.slf4j.Logger Logger = LoggerFactory.getLogger(SpringJenkiiiApplication .class);
	@Test
	public void contextLoads() {
		Logger.info("Test Case executing...");
		assertEquals(true, true);
	}

}
