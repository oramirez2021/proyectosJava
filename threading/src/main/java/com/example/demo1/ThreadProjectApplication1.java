package com.example.demo1;

public class ThreadProjectApplication1 {
    public static void main(String[] args) {
        /*MultithreadExtends multithreadExtends;
        for(int i =0;i <= 5; i++){
            multithreadExtends = new MultithreadExtends(i);
            multithreadExtends.start();
        }*/
        MultithreadImplements multithreadImplements;
        for(int i = 0;i <=5; i++){
            multithreadImplements = new MultithreadImplements(i);
            Thread myThread = new Thread(multithreadImplements);
            myThread.start();
        }
    }
}
