package com.samcgardner.pinkflamingo.lib;

public class PinkFlamingoService {

    public static String fizzBuzzWithPinkFlamingo(int n) {
        boolean isMultipleOfThree = isMultipleOf(n, 3);
        boolean isMultipleOfFive = isMultipleOf(n, 5);
        boolean isFib = isFib(n);
        if (isFib && isMultipleOfFive && isMultipleOfThree) return "Pink Flamingo";
        if (isFib) return "Flamingo";
        if (isMultipleOfThree && isMultipleOfFive) return "FizzBuzz";
        if (isMultipleOfThree) return "Fizz";
        if (isMultipleOfFive) return "Buzz";
        return Integer.toString(n);
    }

    private static boolean isMultipleOf(int input, int divisor) {
        return input % divisor == 0;
    }

    private static boolean isFib(int n) {
        return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);
    }

    // This isn't correct for very large n, so if we can't find any pink flamingos above a certain bound, that's why
    private static boolean isPerfectSquare(int n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }

}
