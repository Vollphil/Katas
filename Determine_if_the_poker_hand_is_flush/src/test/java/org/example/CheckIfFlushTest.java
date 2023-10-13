package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfFlushTest {
@ParameterizedTest
    @CsvSource({
            "'AS, 3S, 9S, KS, 4S', true",
            "'AD,4S,7H,KC,5S',false",
            "'AD,4S,10H,KC,5S',false",
            "'QD,4D,10D,KD,5D',true"
    })

public void testCheckIfFlush(String input, boolean expected){
    String[] inputArray = input.split(", ");
    assertEquals(expected, checkIfFlush.checkIfFlush(inputArray));
}
CheckIfFlush checkIfFlush = new CheckIfFlush();
}