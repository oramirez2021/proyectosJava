package com.example.demo;

public class MultithreadThing2 implements Runnable {
    int threatNumber;
    public MultithreadThing2(int threatNumber) {
        this.threatNumber = threatNumber;
    }
    @Override
    public void run(){
        for (int i = 1; i <= 5 ; i++) {
            System.out.println(i + " from threat number: "+threatNumber);
            if (threatNumber == 3) {
                throw new RuntimeException();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
