package com.example.demo.finalExamples;

public class Final {
    final Integer MAX = 3;
    //uncomment this constructor in order to see that MAX constant cannot be changed.
    /*Final(int x){
        MAX = x;
    }*/
    final public void sayHi(){
        System.out.println("Hi");
    }
    public static void main(String[] args){
       Final f = new Final();
       System.out.println(f.MAX);
       f.sayHi();
    }
}
//uncomment this class if you wanna see that a final method cannot be changed
/*class anotherClass extends Final{
    public void sayHi(){
        System.out.println("omar");
    }
}*/
//uncomment this class if you wanna see that a final class cannot be even extended. For a moment declare Ginal class as final (top class ubication)
/*class anotherClass extends Final{
    public anotherClass(){

    }
}*/

