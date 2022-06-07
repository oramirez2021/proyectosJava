package com.example.demo;


import com.example.demo.clases.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateProjectApplication {

	public static void main(String[] args) {
		List<Student> lista = new ArrayList<>();
		lista.add(new Student("omar",43));
		lista.add(new Student("renzo",41));
		lista.add(new Student("sergio",42));
		lista.add(new Student("michelle",45));
		System.out.println(lista);
		Predicate<Student> p = item -> item.getAge() > 41;
		List<Student> nuevaLista = lista.stream().filter(p).collect(Collectors.toList());
		for (Student s: nuevaLista) {
			System.out.println(s.getName() + " "+ s.getAge());
		}
	}

}
