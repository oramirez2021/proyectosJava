package com.example.demo;


import com.example.demo.clases.Student;
import com.example.demo.clases.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateProjectApplication {
/*this example create a list of Students and using predicate can filter items with ages greater than 41 and
* put it in another list*/
	/*public static void main(String[] args) {
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
	}*/
	public static void main(String[] args){
	List<Teacher> teachers = new ArrayList<>();
	teachers.add(new Teacher("omar","programmer",43));
		teachers.add(new Teacher("renzo","accounting",33));
		teachers.add(new Teacher("sergio","teacher",45));
		teachers.add(new Teacher("michelle","house wife",53));
		teachers.add(new Teacher("mama","politician",23));
		teachers.add(new Teacher("papa","carpenter",63));
		Predicate<Teacher> p = profesor -> profesor.getSpeciality().contains("o");
		Predicate<Teacher> p1 = profesor -> profesor.getAge() > 40;
		List<Teacher> newTeacher = teachers.stream().filter(p).collect(Collectors.toList());
		List<Teacher> newTeacher1 = teachers.stream().filter(p1).collect(Collectors.toList());
		for (Teacher t: newTeacher) {
			System.out.println(t.getAge()+" "+t.getName()+" "+t.getSpeciality());
		}
		for (Teacher t: newTeacher1) {
			System.out.println(p1.test(t)+" "+ t.getAge());
		}

	}
}
