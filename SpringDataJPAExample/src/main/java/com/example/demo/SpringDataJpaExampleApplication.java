package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication

@EnableConfigurationProperties
@EntityScan(basePackages = {"Entity"})  // scan JPA entities
public class SpringDataJpaExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaExampleApplication.class, args);
		System.out.println("begin........");
	}

}
