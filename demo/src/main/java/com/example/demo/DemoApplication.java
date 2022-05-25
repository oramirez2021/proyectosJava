package com.example.demo;

import com.example.demo.clases.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collection;

@SpringBootApplication
public class DemoApplication {
	//override hasCode and equals
	/*public static void main(String[] args) {
		User usuario = new User("omar");
		User usuario1 = new User("omar");
		if (usuario.equals(usuario1)){
			System.out.println("very cool");
		}else{
			System.out.println("Not so cool");
		}
	}*/
	public static void main(String[] args) {
		//Collection coleccion = new ArrayList();
		Collection<Integer> coleccion = new ArrayList();
		coleccion.add(1);
		coleccion.add(2);
		coleccion.add(1);
		//coleccion.add("omar");
		//coleccion.add(5.5);
		coleccion.remove(1);
		for (Object i: coleccion){
			System.out.println(i);
		}
	}

}
