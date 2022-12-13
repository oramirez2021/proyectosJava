package com.oauth20.example.services;

import com.oauth20.example.classs.Dog;

import java.util.ArrayList;
import java.util.List;

public class DogService {
    List<Dog> listDogs = new ArrayList<>();
    public List<Dog> getListDogs(){
        listDogs.add(new Dog("Kratos",15,"Mediano"));
        listDogs.add(new Dog("Can",10,"Pequeno"));
        listDogs.add(new Dog("Olmus",15,"Grande"));
        return listDogs;
    }

}
