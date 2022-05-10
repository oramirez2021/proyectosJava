package com.example.demo.clases;

public class Cat extends Pet{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println(this.name + " said miau!");
    }
}
