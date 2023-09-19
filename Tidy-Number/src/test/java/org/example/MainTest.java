package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @ParameterizedTest
    @CsvSource({
            "1234, true",
            "1111, true",
            "321, false",
            "12321, false"
    })
    void testTidyNumber(int number, boolean expected) {
        assertEquals(expected, tidyNumber(number));
    }

    public static boolean tidyNumber(int number) {
        String numberString = Integer.toString(number);
        char[] digits = numberString.toCharArray();

        for (int i = 0; i < digits.length - 1; i++) {
            if (digits[i] > digits[i + 1]) {
                return false;
            }
        }
        return true;
    }
}