package com.example.demo.clases;

public class Teacher {
    private String name;
    private String speciality;
    private int age;
    public Teacher(String name,String speciality,int age){
        this.name = name;
        this.speciality = speciality;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
