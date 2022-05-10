package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

@SpringBootApplication
public class ThreadProjectApplication{
	//extends
	/*public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			MultithreadThing myThing = new MultithreadThing(i);
			myThing.start();
		}
		throw new RuntimeException();
	}*/
	//implements
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			MultithreadThing2 myThing = new MultithreadThing2(i);
			Thread myThreat = new Thread(myThing);
			myThreat.start();
			/*try {
				myThreat.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
		}

	}

}
