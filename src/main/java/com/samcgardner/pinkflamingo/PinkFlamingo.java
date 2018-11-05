package com.samcgardner.pinkflamingo;

import java.util.stream.IntStream;

public class PinkFlamingo {

    public static void main(String[] args) {
        IntStream.range(0, 101)
                .boxed()
                .map(PinkFlamingo::fizzBuzzWithPinkFlamingo)
                .forEach(System.out::println);
    }

    public static String fizzBuzzWithPinkFlamingo(int n) {
        return "1";
    }

}
