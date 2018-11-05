package com.samcgardner.pinkflamingo;

import org.junit.Test;

import static com.samcgardner.pinkflamingo.PinkFlamingo.fizzBuzzWithPinkFlamingo;
import static junit.framework.TestCase.assertEquals;

public class PinkFlamingoTest {

    @Test
    public void isIdentityOnOne() {
        String result = fizzBuzzWithPinkFlamingo(1);
        assertEquals("1", result);
    }

    @Test
    public void fizzesOnThree() {
        String result = fizzBuzzWithPinkFlamingo(3);
        assertEquals("Fizz", result);
    }

    @Test
    public void buzzesOnFive() {
        String result = fizzBuzzWithPinkFlamingo(5);
        assertEquals("Buzz", result);
    }

    @Test
    public void fizzBuzzesOnFifteen() {
        String result = fizzBuzzWithPinkFlamingo(15);
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void flamingosOnOne() {
        String result = fizzBuzzWithPinkFlamingo(1);
        assertEquals("Flamingo", result);
    }

    @Test
    public void pinkFlamingosOn6765() {
        String result = fizzBuzzWithPinkFlamingo(6765);
        assertEquals("Pink Flamingo", result);
    }

}
