package com.controle.tdd;

public class FizzBuzz {
    public static String de(int i) {
        if (i % 3 == 0) return "Fizz";
        if (i == 5) return "Buzz";
        return String.valueOf(i);
    }
}
