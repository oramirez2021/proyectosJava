package com.predicate;

import java.util.function.Predicate;

public class Test {
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
