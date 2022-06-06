package com.example.demo;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetProjectApplication2 {
    public static void main(String[] args){
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        hashSet.add("renzo");
        hashSet.add("sergio");
        hashSet.add("michelle");
        hashSet.add(5);
        hashSet.add("omar");
        Iterator i = hashSet.iterator();
        while ((i.hasNext())){
            System.out.println(i.next());
        }
        /*Iterator<String> i = hashSet.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }*/
    }
}
