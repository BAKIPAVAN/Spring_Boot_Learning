package com.learning.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.learning")
public class SpringJpaTutorial01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaTutorial01Application.class, args);
		System.out.println("started..........");
	}

}
