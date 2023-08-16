package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class VowelsTest {
@ParameterizedTest
@CsvSource({
"hello, 2",
"seed, 2",
"abracadabra, 5",
"null ,0",
 "hey i am a tree, 6"
})

    void testVowels(String str, int expected) {
    assertEquals(expected, vowels.getCount(str));
}

   Vowels vowels = new Vowels();



}