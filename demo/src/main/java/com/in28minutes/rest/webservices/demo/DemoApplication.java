package com.in28minutes.rest.webservices.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.print("hello...");
		SpringApplication.run(DemoApplication.class, args);
	}

}
