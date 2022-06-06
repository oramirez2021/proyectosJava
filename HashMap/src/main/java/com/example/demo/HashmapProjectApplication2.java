package com.example.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashmapProjectApplication2 {
    /*public static void main(String[] args){
        Map<Integer,String> x = new HashMap<>();
        x.put(1,"carolina");
        x.put(2,"Marcos");
        x.put(3,"Dario");
        x.put(4,"Fernando");
        for (Integer entero : x.keySet()){
            System.out.println(entero);
        }
    }*/
    /*public static void main(String[] args){
        HashMap<Integer,String> numbers =  new HashMap<>();
        numbers.put(1,"omar");
        numbers.put(2,"omar");
        numbers.put(3,"omar");
        numbers.put(4,"omar");
        numbers.put(5,"omar");
        numbers.put(6,"omar");
        System.out.println(numbers);
        Iterator<Integer> i = numbers.keySet().iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        for(Integer numeros : numbers.keySet()){
            System.out.println(numeros);
        }
        Iterator<Integer> ii = numbers.keySet().iterator();
        while (ii.hasNext()){
            if (ii.next()%2==1) {
                System.out.println("entro");
                System.out.println(ii.next());
            }
        }
    }*/
    public static void main(String[] args){
        HashMap<Integer,String> valores = new HashMap<>();
        Iterator<Integer> i = valores.keySet().iterator();
        int ii = 0;
        while (!i.hasNext()){
            valores.put(ii,"omar");
            System.out.println("hola");
            if(ii == 100){
                break;
            }
            ii++;
        }
        while (i.hasNext()){
            valores.put(ii,"omar");
            System.out.println("hola");
            ii++;
            if(ii == 100){
                break;
            }
        }
    }
}
