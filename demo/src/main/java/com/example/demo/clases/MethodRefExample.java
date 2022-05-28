package com.example.demo.clases;

import com.example.demo.interfaces.MyInterface1;

//usar con Myinterface1
public class MethodRefExample {
    public static void main(String[] args) {
        MyInterface1 interface1 =(a, b) -> a+b;
        int suma = interface1.sum(10,20);
        System.out.println("suma using lambda expression "+suma);
        MyInterface1 interface11 = Test::calculate;
        int suma1 = interface1.sum(10,20);
        System.out.println("suma using double colon ::  "+suma);
    }
}
