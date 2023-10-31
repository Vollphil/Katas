package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BackspacesInStringTest {

    @ParameterizedTest
    @CsvSource({
            "abc#d##c, ac",
            "abc####d##c#, ''",
            "####abc#d##c, ac"
    })
void backspaceInStringTest(String input,String expected){
assertEquals(expected,backspacesInString.cleanString(input));

    }
    BackspacesInString backspacesInString = new BackspacesInString();
}