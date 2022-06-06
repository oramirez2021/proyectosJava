package com.example.demo;

import java.util.*;
import java.util.Map.*;

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
    /*public static void main(String[] args){
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
    }*/
    /*how to read add elements from HashMap. The method keySet() returns all key
    entries as a set object. Iterating through each key, we can get corresponding value object.*/
    /*public static void main(String[] args){
        HashMap<String,String> valores = new HashMap<>();
        valores.put("uno","omar");
        valores.put("dos","renzo");
        valores.put("tres","sergio");
        valores.put("cuatro","michelle");
        valores.put("cinco","mama");
        valores.put("seis","papa");
        Set<String> indices = valores.keySet();
        for(String x:indices){
            System.out.println(valores.get(x));
        }
    }*/
    /*
    how to copy another collection to HashMap. putAll() method helps us to copy
    another collections to HashMap object. If index are diferent putall add not replace.
    */
     /*public static void main(String[] args){
         HashMap<Integer,String> x = new HashMap<>();
         HashMap<Integer,String> y = new HashMap<>();
         x.put(1,"omar");
         x.put(2,"renzo");
         x.put(3,"sergio");
         x.put(4,"michelle");
         x.put(5,"papa");
         x.put(6,"mama");
         y.put(7,"camila");
         y.put(8,"dani");
         y.putAll(x);
         System.out.println(x);
         System.out.println(y);
     }*/
    /*
    how to get all key-value pair as Entry objects. Entry class provides getter methods
    to access key-value details. The method entrySet() provides all entries as set object.
     */
    public static void main(String[] args) {
        HashMap<Integer, String> x = new HashMap<>();
        x.put(1,"omar");
        x.put(2,"renzo");
        x.put(3,"sergio");
        x.put(4,"michelle");
        x.put(5,"papa");
        x.put(6,"mama");
        System.out.println(x);
        Set<Entry<Integer,String>> seteado =  x.entrySet();
        for (Entry<Integer,String> y : seteado) {
            System.out.println(y.getValue());
        }
    }
}
