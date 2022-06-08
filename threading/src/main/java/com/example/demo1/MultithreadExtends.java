package com.example.demo1;

public class MultithreadExtends extends Thread{
    int threadNumber;
    public MultithreadExtends(int threadNumber){
        this.threadNumber = threadNumber;
    }
    @Override
    public void run(){
        for (int i=0;i<=5;i++) {
            System.out.println("I am the number "+i+" from the thread "+threadNumber);
            if(threadNumber == 3){
                throw new RuntimeException();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
