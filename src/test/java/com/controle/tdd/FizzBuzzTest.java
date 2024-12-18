package com.controle.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void testFizzBuzz1() {
        assertEquals("1", FizzBuzz.de(1));
    }
}
