package com.example.demo;

import com.example.demo.clases.Cat;
import com.example.demo.clases.Dog;

public class AbstractProjectApplication {

	public static void main(String[] args) {
		Cat myCat = new Cat();
		myCat.makeNoise();
		Dog myDog = new Dog();
		myDog.poof();
	}

}
