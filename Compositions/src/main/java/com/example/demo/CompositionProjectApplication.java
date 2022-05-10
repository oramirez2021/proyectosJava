package com.example.demo;

import com.example.demo.clases.Cat;
import com.example.demo.clases.Dog;
import com.example.demo.clases.Person;

import java.util.*;

public class CompositionProjectApplication {

	public static void main(String[] args) {
		Dog myDog = new Dog("Kratos",1);
		Cat myCat = new Cat("Manchas",2);
		myDog.speak();
		myCat.speak();
		Person per1 = new Person("Omar",43);
		Person per2 = new Person("Renzo",40);
		per1.setPet(myDog);
		per2.setPet(myCat);
		System.out.println(per1.getName()+" has a pet named "+per1.getPet().getName());
		System.out.println(per2.getName()+" has a pet named "+per2.getPet().getName());
	}

}
