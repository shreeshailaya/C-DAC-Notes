package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootIAssignment1Application {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(SpringBootIAssignment1Application.class, args);
		TestSpringBootApplication test = context.getBean(TestSpringBootApplication.class);
		System.out.println(test);
		
		String [] beanArray =  context.getBeanDefinitionNames();
		
		for(String bean : beanArray) {
			System.out.println(bean);
		}
		
		System.out.println(context.getBeanDefinitionCount());
		
	}

}
