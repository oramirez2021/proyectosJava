package com.example.demo.abstracts;

public abstract class Animal {
    int age;
    String name;
    public abstract  void makeNoise();
    public void printName(){
        System.out.println("this is my name: "+name);
    }
}
