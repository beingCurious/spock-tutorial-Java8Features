package com.examples.spock.enumExample;

import com.examples.spock.sampleEnums.Fish;

import static com.examples.spock.sampleEnums.Fish.GUPPY;

public class TestEnum01 {
    public static void main(String[] args) {
        System.out.println(Fish.STAR.compareTo(GUPPY));
    }
}
