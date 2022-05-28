package com.example.demo.clases;

public class Test {
    private String message;
    public Test(){

    }
    public Test (String message){
        System.out.println("test class message showing using "+message);
    }
    public static int calculate(int x, int y){
        return x-y;
    }
    public int add(int x, int y){
            return x+y;
    }
}
