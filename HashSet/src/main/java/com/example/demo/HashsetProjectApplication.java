package com.example.demo;

import java.util.*;

public class HashsetProjectApplication {

	public static void main(String[] args) {
		// HashSet
		/*Set<String> names = new HashSet<String>();
		names.add("Mrs");
		names.add("Monica");
		names.add("Agarwal");
		Iterator<String> i = names.iterator();
		while (i.hasNext()){
			System.out.println("Full Name: "+i.next()+" "+i.next()+" "+i.next());
		}*/
		//LinkHashSet
		//Generic: Specific type of object
		//Non-generic: Combination
		Set<Integer>  linkedHashSet = new LinkedHashSet<Integer>();
		linkedHashSet.add(10);
		linkedHashSet.add(20);
		linkedHashSet.add(30);
		linkedHashSet.add(40);
		linkedHashSet.add(50);
		for(Integer i:linkedHashSet){
			System.out.println(i);
		}
		System.out.println("------------------");
		linkedHashSet.remove(20);
		linkedHashSet.remove(30);
		for(Integer i:linkedHashSet){
			System.out.println(i);
		}
		System.out.println("using iterator");
		//Using iterator
		Iterator<Integer> i = linkedHashSet.iterator();
		while (i.hasNext()){
			System.out.println(i.next());
		}
		Set<String> x = new HashSet<>();
		x.
	}

}
