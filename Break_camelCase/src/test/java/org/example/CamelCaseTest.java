package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CamelCaseTest {
    @ParameterizedTest
    @CsvSource({
        "camelCase, camel Case",
            "letsTestThisKata, lets Test This Kata",
            "iamABananaAndtryToNotthinkAboutIt, iam A Banana Andtry To Notthink About It"
    })

    void camelCaseTest(String input,String expected){
        assertEquals(expected,camelCase.camelCase(input));

    }
CamelCase camelCase = new CamelCase();
}