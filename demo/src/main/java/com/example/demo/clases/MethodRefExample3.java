package com.example.demo.clases;

import com.example.demo.interfaces.MyInterface1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* lambdas and double colons
usar con Myinterface1*/
public class MethodRefExample3 {
    public static void main(String[] args) {
        //by using method reference
        //List<String> array1 = Arrays.asList("omar","renzo","sergio","michelle");
        List<String> array1 = new ArrayList<>();
        array1.add("omar");
        array1.add("renzo");
        array1.add("sergio");
        array1.add("michelle");
        List<String> lista = array1.stream().map(String::toUpperCase).toList();
        lista.forEach(System.out::println);
    }
}
