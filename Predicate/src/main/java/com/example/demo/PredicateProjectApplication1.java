package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateProjectApplication1 {
    /*Following example demonstrates that, return true if given number divisible by 2 and greater than 10 using Predicate and also
    prints names from list if name starts with “P” and does not end with “p”.*/
    public static void main(String[] args){
        int[] numbers = {15,16,20,25,26,33,36,80,81};
        List<String> names = new ArrayList<>();
        names.add("omar");
        names.add("renzo");
        names.add("sergio");
        names.add("michelle");
        names.add("ivonne");
        names.add("papa");
        //Predicate<Integer> p1 = x -> x % 2 ==0 && x > 10;
        //Predicate<String> p2 = y -> y.startsWith("p") && !y.endsWith("p");
        Predicate<Integer> p1 =  x -> x % 2 == 0;
        Predicate<Integer> p2 =  x -> x > 10;
        Predicate<String> p3 =  y -> y.startsWith("p");
        Predicate<String> p4 =  y -> !y.endsWith("p");
        for (int i: numbers) {
            if(p1.and(p2).test(i)) {
                System.out.println(i);
            }
        }
        for (String ii: names) {
            if(p3.and(p4).test(ii)) {
                System.out.println(ii);
            }
        }
    }
}
