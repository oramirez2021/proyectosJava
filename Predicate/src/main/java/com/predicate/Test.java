package com.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test {
    /*first excercise with predicates*/
   /* public static void main(String[] args){
        int[] numeros = {51,85,25,2,35,65};
        Predicate<Integer> p1 = number -> number % 2 == 0;
        Predicate<Integer> p2 = number1 -> number1 > 2;
        Predicate<Integer> p3 = number2 -> number2 > 50;
        System.out.println("even numbers");
        m1(p1,numeros);
        System.out.println("numbers greater than 2");
        m1(p2,numeros);
        System.out.println("numbers greater than 50");
        m1(p3,numeros);
    }
    public static void m1(Predicate<Integer> p, int[] list_numbers){
        for (int i: list_numbers) {
            if(p.test(i)){
                System.out.println(i);
            }
        }
    }*/
    public static void main(String[] args) {
       /* funciona
       Predicate<Integer> p=I->I>50;
        Predicate<String> p1=I1->I1.length()>5;
        System.out.println(p.test(25));
        System.out.println(p1.test("OmarOmar"));*/
        int list_numbers[] = {1,2,3,4,5,6};
        Predicate<Integer> p1 = I -> I%2 == 0;
        Predicate<Integer> p2 = I -> I > 2;
        /*System.out.println("even numbers: ");
        m1(p1,list_numbers);*/
        System.out.println("even numbers: ");
        m1(p1,list_numbers);
        System.out.println("numbers greater than 2: ");
        m1(p2,list_numbers);
        System.out.println("numbers greater than 2 and even: ");
        m1(p2.and(p1),list_numbers);
        System.out.println("odd numbers: ");
        m1(p1.negate(),list_numbers);
        System.out.println("numeros unidos: ");
        m1(p1.or(p2),list_numbers);
    }
    public static void m1(Predicate<Integer> p, int[] list_numbers){
        for (int i:list_numbers) {
            if(p.test(i))
                System.out.println(i);
        }
    }
}
