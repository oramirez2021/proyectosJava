package com.example.demo.clases;

import com.example.demo.interfaces.MyInterface2;

import java.util.ArrayList;
import java.util.List;

/* lambdas and double colons
usar con Myinterface1*/
public class MethodRefExample4 {
    public static void main(String[] args) {
        //byusing lambda expression
        MyInterface2 myInterface2 = (message) -> new Test(message);
        myInterface2.showMessage("lamba expresion ");
        //by using constructor reference
        MyInterface2 myInterface21 = Test::new;
        myInterface21.showMessage("constructor reference ");
    }
}
