package com.examples.spock.java8.features.basicFeatures;

public class LambdaExpressions {
    public static void main(String[] args) {
//        InterfWithNoArgs i = ()-> System.out.println("Hello World");
//        i.m1();
//
        InterfWithOneStringArg  is= s-> System.out.println(s.length());
        is.getLength("HelloWorld");

//        InterfWithOneGenericArg<Integer> genricObj = (x)-> System.out.println(x*x);
//        genricObj.m1(5);
//        genricObj.m1(10);
//
//        InterfWithOneGenericArg<String> genric = (x)-> System.out.println(x.length());
//        genric.m1("Hello World");

//        InterfWithOneGenericArgAndOneGenericReturnType<Integer> withReturnType= x-> x*x;
//        System.out.println(withReturnType.m1(6));

    }
}
