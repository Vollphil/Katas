package org.example;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("provideTestCases")
    public void testSolutionMethod(int input, int expectedSum) {
        Solution solution = new Solution();
        assertEquals(expectedSum, solution.solution(input));
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(10, 23),
                Arguments.of(15, 45),
                Arguments.of(20, 78),
                Arguments.of(200, 9168)

        );
    }
}