package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SumSquaredDivisorsTest {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    public void testListSquared(long m, long n,String expectedString){
        SumSquaredDivisors sumSquaredDivisors = new SumSquaredDivisors();
        String actual = sumSquaredDivisors.listSquared(m, n);
        assertEquals(expectedString, actual);



    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(1, 250, "[[1, 1], [42, 2500], [246, 84100]]"),
                Arguments.of(42, 250, "[[42, 2500], [246, 84100]]"),
                Arguments.of(250, 500, "[[287, 84100]]"),
                Arguments.of(300, 600, "[]"),
                Arguments.of(600, 1500, "[[728, 722500], [1434, 2856100]]"),
                Arguments.of(1500, 1800, "[[1673, 2856100]]"),
                Arguments.of(5000, 10000, "[[6237, 45024100], [9799, 96079204], [9855, 113635600]]")
        );
    }
}