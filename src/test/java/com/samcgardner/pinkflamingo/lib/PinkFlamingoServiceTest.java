package com.samcgardner.pinkflamingo.lib;

import org.junit.Test;

import static com.samcgardner.pinkflamingo.lib.PinkFlamingoService.fizzBuzzWithPinkFlamingo;
import static junit.framework.TestCase.assertEquals;

public class PinkFlamingoServiceTest {

    @Test
    public void isIdentityOnFour() {
        String result = fizzBuzzWithPinkFlamingo(4);
        assertEquals("4", result);
    }

    @Test
    public void fizzesOnSix() {
        String result = fizzBuzzWithPinkFlamingo(6);
        assertEquals("Fizz", result);
    }

    @Test
    public void buzzesOnTen() {
        String result = fizzBuzzWithPinkFlamingo(10);
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
