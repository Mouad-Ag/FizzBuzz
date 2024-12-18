package com.controle.tdd;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
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
    @ParameterizedTest
    @CsvSource({
            "1, 1", "2, 2", "3, Fizz", "4, 4", "5, Buzz",
            "6, Fizz", "7, 7", "8, 8", "9, Fizz", "10, Buzz",
            "11, 11", "12, Fizz", "13, 13", "14, 14", "15, FizzBuzz",
            "16, 16", "17, 17", "18, Fizz", "19, 19", "20, Buzz"
    })
    public void testFizzBuzzParametrized(int input, String expected) {
        assertEquals(expected, FizzBuzz.de(input));
    }

}
