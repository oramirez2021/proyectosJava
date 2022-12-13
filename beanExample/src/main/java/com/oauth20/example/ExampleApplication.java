package com.oauth20.example;

import com.oauth20.example.services.DogService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ExampleApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExampleApplication.class);
		DogService ctx = applicationContext.getBean(DogService.class);
		System.out.println(ctx.getListDogs());
	}


}
