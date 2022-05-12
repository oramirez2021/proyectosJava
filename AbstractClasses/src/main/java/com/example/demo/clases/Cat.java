package com.example.demo.clases;

import com.example.demo.abstracts.Animal;

public class Cat extends Animal {

    @Override
    public void makeNoise() {
        System.out.println("miau");
    }
}