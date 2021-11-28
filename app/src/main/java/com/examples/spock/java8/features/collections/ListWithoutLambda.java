package com.examples.spock.java8.features.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListWithoutLambda {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(0);
        l.add(20);
        l.add(15);
        l.add(5);
        l.add(25);

        // Using Comparator Interface (Functional Interface) with SAM i.e. compare()
        Comparator<Integer> comare = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };


        /**
         * Collections: Collection of things
         *      List:
         *      Set:
         *      Map:
         *
         */


    }
}
