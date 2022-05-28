package com.example.demo.clases;

import com.example.demo.interfaces.MyInterface1;

/* lambdas and double colons
usar con Myinterface1*/
public class MethodRefExample1 {
    public static void main(String[] args) {
        MyInterface1 myInterface = new Test()::add;
        System.out.println(myInterface.sum(8,9));
    }
}
