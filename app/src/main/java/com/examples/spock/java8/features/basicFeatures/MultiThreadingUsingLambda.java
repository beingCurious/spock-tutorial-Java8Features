package com.examples.spock.java8.features.basicFeatures;

public class MultiThreadingUsingLambda {

    /**
     * Interview Question: Using Lambda Expressions Define a thread to return "Inner Hello World", Start and Execute that Thread
     * @param args
     */
    public static void main(String[] args) {
        // Defined a Thread
        // Function Assignment i.e. assigning a Function to an Interface Type
        // Here, Runnable Interface is a Functional Interface
        Runnable r = ()-> {for (int i = 0; i < 10; i++) {System.out.println("Inner Thread");}};
        Thread t = new Thread(r);
        //Start a Thread
        t.start();
        for (int i=0; i<10; i++){
            System.out.println("Main Thread");
        }

    }
}
