package com.example.demo;


import com.example.demo.clases.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateProjectApplication {

	public static void main(String[] args) {
		List<Student> students= new ArrayList<>();
		students.add(new Student("omar",43));
		students.add(new Student("renzo",41));
		students.add(new Student("sergio",39));
		students.add(new Student("michelle",45));
		students.add(new Student("joaquin",22));
		System.out.println(students);
		Predicate<Student> p = student -> student.getAge() >= 40;
		List<Student>  filtered = students.stream().filter(p).collect(Collectors.toList());
		System.out.println(filtered);
	}

}
