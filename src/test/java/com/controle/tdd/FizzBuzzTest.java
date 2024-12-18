package com.controle.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void testFizzBuzz1() {
        assertEquals("1", FizzBuzz.de(1));
    }
    @Test
    public void testFizzBuzz3() {
        assertEquals("Fizz", FizzBuzz.de(3));
    }
    @Test
    public void testFizzBuzz5() {
        assertEquals("Buzz", FizzBuzz.de(5));
    }
    @Test
    public void testFizzBuzz15() {
        assertEquals("FizzBuzz", FizzBuzz.de(15));
    }
    @Test
    public void testFizzBuzzOtherNumbers() {
        assertEquals("7", FizzBuzz.de(7));
    }
}
