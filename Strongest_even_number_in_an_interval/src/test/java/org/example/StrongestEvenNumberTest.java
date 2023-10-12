package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StrongestEvenNumberTest {

    @ParameterizedTest
    @CsvSource({
            "1, 2, 2",
            "5, 10, 8",
            "48, 56, 48",
            "129, 193, 192"

    })
void testStrongestEvenNumber(int n,int m,int expected){
        assertEquals(expected,strongestEvenNumber.strongestEven(n,m));
    }
    StrongestEvenNumber strongestEvenNumber = new StrongestEvenNumber();


}