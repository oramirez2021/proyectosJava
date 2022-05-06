package com.example.demo;

import java.util.*;

public class HashsetProjectApplication {

	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();
		names.add("Mrs");
		names.add("Monica");
		names.add("Agarwal");
		Iterator<String> i = names.iterator();
		while (i.hasNext()){
			System.out.println("Full Name: "+i.next()+" "+i.next()+" "+i.next());
		}
	}

}
