package com.example.demo.overrideAndOverload;

public class OverrideExample extends Superclass1 {

    @Override
    public void message(){
        super.message();
        System.out.print("Esta es la sub clase");
    }
    public static void main(String[] args){
        OverrideExample obj = new OverrideExample();

        obj.message();
    }
}
