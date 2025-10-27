package com.codefirstgirl.myfirstspringproject;

import com.codefirstgirl.myfirstspringproject.exercise1.ExampleService;
import com.codefirstgirl.myfirstspringproject.exercise2.SpecificEvent;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.time.LocalDate;

@Slf4j
@SpringBootApplication
public class MyFirstSpringProjectApplication {

	@Value("${server.port}")
	private int serverPort;

	@Value("${app.name}")
	private String appName;

	@Value("${app.message}")
	private String message;

	@Value("${cfg.website}")
	private String website;

	@PostConstruct
	public void init() {
		log.info("test");
		log.info("Server port: {}", serverPort);
		log.info("App name: {}", appName);
		log.info("Message: {}", message);
		log.info("Website: {}", website);
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MyFirstSpringProjectApplication.class, args);

		LocalDate specificDate = context.getBean(LocalDate.class);
		System.out.println("The date is: " + specificDate);

		SpecificEvent event = context.getBean(SpecificEvent.class);
		System.out.println("Event: " + event);
	}

}
