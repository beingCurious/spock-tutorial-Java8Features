package com.examples.spock.java8.features.basicFeatures;

public class MultiThreadingUsingAnonymousInnerClass {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Inner Thread");
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
        for (int i=0; i<10; i++){
            System.out.println("Main Thread");
        }
    }
}
