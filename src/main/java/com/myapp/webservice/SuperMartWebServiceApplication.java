package com.myapp.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SuperMartWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuperMartWebServiceApplication.class, args);
		
		System.out.println("Welcome to Fresh Super Mart...!");
	}

}
