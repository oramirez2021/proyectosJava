package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@SpringBootApplication
public class HashmapProjectApplication {

	public static void main(String[] args) {

		/*HashMap<String, Integer> empIds = new HashMap<>();
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
		System.out.println(empIds);*/
		/*
		HashMap<String,Integer> hashMap = new HashMap<>();
		hashMap.put("omar",5655454);
		hashMap.put("renzo", 85897987);
		hashMap.put("michelle", 848974);
		hashMap.put("sergio",788585896);
		System.out.println(hashMap);
		System.out.println(hashMap.get("sergio"));
		System.out.println(hashMap.containsKey("renzo"));
		System.out.println(hashMap.containsKey("renzo"));
		System.out.println(hashMap.containsKey("papa"));
		System.out.println(hashMap.containsValue(788585896));
		*/
		/*
		HashMap<Integer,String> hashMap1 = new HashMap<>();
		hashMap1.put(1,"omar");
		hashMap1.put(20,"renzo");
		hashMap1.put(300,"sergio");
		hashMap1.put(4000,"michelle");
		hashMap1.put(50000,"mama");
		hashMap1.put(600000,"papa");
		//hashMap1.remove(5);
		hashMap1.replace(50000,"mamita");
		System.out.println(hashMap1);
		Iterator<Integer> i = hashMap1.keySet().iterator();
		//Iterator<String> i = hashMap1.values().iterator();

		while(i.hasNext()){
			System.out.println(i.next());
		}
		*/
		//using Map class
		//Map<Integer,String> hashmap2 = new HashMap<>();
		Map<Integer,String> hashmap2 = new HashMap<>();
		hashmap2.put(1,"vanderson");
		hashmap2.put(20,"Eddy");
		hashmap2.put(300,"Michael");
		hashmap2.put(4000,"Roberto");
		hashmap2.put(50000,"Camila");
		/*for(Integer key : hashmap2.keySet()){
			System.out.println(key);
		}*/
		for(String value : hashmap2.values()){
			System.out.println(value);
		}
	}

}

