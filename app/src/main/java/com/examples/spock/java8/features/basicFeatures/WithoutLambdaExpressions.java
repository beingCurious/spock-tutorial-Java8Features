package com.examples.spock.java8.features.basicFeatures;

public class WithoutLambdaExpressions {

    public static void main(String[] args) {
        Demo d = new Demo();
        d.m1();
    }
}

class Demo implements InterfWithNoArgs {

    @Override
    public void m1() {
        System.out.println("-----------------------------------------------------");
        System.out.println("Hello World");
        System.out.println("-----------------------------------------------------");
    }
}
