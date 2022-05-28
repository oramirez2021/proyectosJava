package com.example.demo.clases;

import com.example.demo.interfaces.MyInterface1;
/* lambdas and double colons
usar con Myinterface1*/
public class MethodRefExample {
    public static void main(String[] args) {
        MyInterface1 interface1 =(a, b) -> a+b;
        int suma = interface1.sum(10,20);
        System.out.println("suma using lambda expression "+suma);
        MyInterface1 interface12 = Test::calculate;
        int suma1 = interface12.sum(10,20);
        System.out.println("suma using double colon ::  "+suma1);
        //traditional overriding
        MyInterface1 interface13 = new MyInterface1() {
            @Override
            public int sum(int a, int b) {

                return (a+b)*5;
            }
        };
        System.out.println("traditional code manipulation "+interface13.sum(5,10));
    }
}
