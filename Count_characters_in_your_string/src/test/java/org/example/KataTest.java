package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    public void countTest(String input, Map<Character, Integer> expectedMap) {
        Kata kata = new Kata();
        assertEquals(expectedMap, kata.count(input));
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of("", Map.of()),
                Arguments.of("aaaa", Map.of('a', 4)),
                Arguments.of("abcd", Map.of('a', 1, 'b', 1, 'c', 1, 'd', 1)),
                Arguments.of("aAbB", Map.of('a', 1, 'A', 1, 'b', 1, 'B', 1)),
                Arguments.of("123!123!", Map.of('1', 2, '2', 2, '3', 2, '!', 2)),
                Arguments.of("a b c a", Map.of('a', 2, ' ', 3, 'b', 1, 'c', 1))
        );
    }
}