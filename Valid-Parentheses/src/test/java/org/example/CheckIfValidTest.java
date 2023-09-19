package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfValidTest {

   @ParameterizedTest
   @CsvSource({
           "(()), true",
           "((), false",
           "((((())))), true"

   })
    void isValidParentheses(String parentheses,boolean expected) {
       assertEquals(expected,checkIfValid.isValidParentheses(parentheses));
    }

    CheckIfValid checkIfValid = new CheckIfValid();
}