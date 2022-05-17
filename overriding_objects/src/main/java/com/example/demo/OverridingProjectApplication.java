package com.example.demo;

import java.util.*;
class Human{

	public void eat(){
		System.out.println("humano comiendo");
	}
}
class Boy extends Human {
	@Override
	public void eat(){
		System.out.println("niño comiendo");
	}

}
public class OverridingProjectApplication {

	public static void main(String[] args) {
		Human humano = new Human();
		humano.eat();
		Human nino = new Boy();
		nino.eat();
	}
}
