package com.example.demo;

import com.example.demo.clases.Cat;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args){
		Optional<Cat> gato = getCatByName("manchas");
		//One form to ask
		if (gato.isPresent()){
			System.out.print(gato.get().getAge());
		}else {
			System.out.println(0);
		}
		//Another form to ask
		Cat gato1 = gato.orElse(new Cat("UNKNOWN",11));
		System.out.println(gato1.getAge());
	}
	/*public static Cat getCatByName(String name){
		Cat cat = new Cat(name,5);
		return null;
	}*/
	public static Optional<Cat> getCatByName(String name){
		Cat cat = new Cat(name,10);
		return Optional.ofNullable(cat);
	}

}
