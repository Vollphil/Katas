package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class VowelRemoverTest {
    VowelRemover vowelRemover = new VowelRemover();
    @ParameterizedTest
    @CsvSource({
            "hello, hll",
            "animated, nmtd",
            "ultra, ltr",
            "aieoul, l"



    })

    void shortcut(String input, String expected) {
        assertEquals(expected, vowelRemover.shortcut(input));
    }



}