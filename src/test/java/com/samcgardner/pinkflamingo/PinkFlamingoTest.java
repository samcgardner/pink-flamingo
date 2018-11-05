package com.samcgardner.pinkflamingo;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PinkFlamingoTest {

    @Test
    public void isIdentityOnOne() {
        String result = PinkFlamingo.fizzBuzzWithPinkFlamingo(1);
        assertEquals("1", result);
    }

}
