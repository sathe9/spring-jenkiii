package com.javatechiee.jenkins.api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkiiiApplication {
	public static org.slf4j.Logger Logger = LoggerFactory.getLogger(SpringJenkiiiApplication .class);
	@PostConstruct
public void intt() {
	Logger.info("Application started...");
}
	public static void main(String[] args) {
		SpringApplication.run(SpringJenkiiiApplication.class, args);
		Logger.info("Application executed...");
	}

}
