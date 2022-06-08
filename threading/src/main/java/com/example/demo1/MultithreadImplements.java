package com.example.demo1;

public class MultithreadImplements implements Runnable{
    int threadNumber;
    public MultithreadImplements(int threadNumber){
        this.threadNumber = threadNumber;
    }
    @Override
    public void run(){
        for (int i = 0;i <= 5;i++) {
            System.out.println("number "+i+" from thread "+threadNumber);
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
