package com.example.demo1;

public class MultithreadExtends extends Thread{
    int hilo;
    public MultithreadExtends(int hilo){
        this.hilo = hilo;
    }
    @Override
    public void run(){

        for (int i=0;i<=5;i++) {
            System.out.println(i +" from thread "+hilo);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
}
