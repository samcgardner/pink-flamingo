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
        boolean isMultipleOfThree = isMultipleOf(n, 3);
        boolean isMultipleOfFive = isMultipleOf(n, 5);
        if (isMultipleOfThree && isMultipleOfFive) return "FizzBuzz";
        if (isMultipleOfThree) return "Fizz";
        if (isMultipleOfFive) return "Buzz";
        return Integer.toString(n);
    }

    private static boolean isMultipleOf(int input, int divisor) {
        return input % divisor == 0;
    }

}
