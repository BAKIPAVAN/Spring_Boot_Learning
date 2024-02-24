package com.springboot.Sampleproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
//@EntityScan(basePackages = {"com.springboot.Sampleproject.model"})  // scan JPA entities)
public class SpringBootBackendLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendLearningApplication.class, args);
		System.out.println("Started.............");
		System.out.println("Please proced.............");
	}

}
