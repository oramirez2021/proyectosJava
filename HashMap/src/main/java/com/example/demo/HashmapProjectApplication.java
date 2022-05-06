package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

@SpringBootApplication
public class HashmapProjectApplication {

	public static void main(String[] args) {

		HashMap<String, Integer> empIds = new HashMap<>();
		empIds.put("John",12345);
		empIds.put("Carl", 54321);
		empIds.put("Jerry", 8675309);
		System.out.println(empIds);
		System.out.println(empIds.get("Carl"));
		System.out.println(empIds.containsKey("Jerry"));
		System.out.println(empIds.containsValue(8675309));
		empIds.put("John",85855);
		System.out.println(empIds);
		empIds.replace("John1",54665545);
		System.out.println(empIds);
		empIds.putIfAbsent("John2",8888);
		System.out.println(empIds);
		empIds.remove("John2");
		System.out.println(empIds);

	}

}
