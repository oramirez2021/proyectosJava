package com.helloworld.helloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {

		SpringApplication.run(HelloWorldApplication.class, args);
		String nombre1 = args[0];
		String nombre2 = args[1];

		System.out.println("Hello "+nombre1+" and "+nombre2);
		System.out.println("Goodbye "+nombre2+" and "+nombre1);
	}

}
