package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.demo.*")
public class SpringBootIiAssignment1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootIiAssignment1Application.class, args);
	}

}
