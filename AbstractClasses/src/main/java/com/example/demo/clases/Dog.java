package com.example.demo.clases;

import com.example.demo.interfaces.AnimalStuff;

public class Dog implements AnimalStuff {

    @Override
    public void poof() {
        System.out.println("asdkjkjasfdkljkldfsaklasfd");
    }

    @Override
    public void makeNoise1() {
        System.out.println("guau guau");
    }
}
