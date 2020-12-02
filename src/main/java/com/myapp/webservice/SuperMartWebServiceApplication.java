package com.myapp.webservice;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SuperMartWebServiceApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(SuperMartWebServiceApplication.class, args);
		
		System.out.println("Welcome to Fresh Super Mart...!");
		File file=new File("test.txt");
		String question = "HelloWorld";
	     
		Files.write(file.toPath(), question.getBytes());
	}

}
