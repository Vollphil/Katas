package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


class SolutionTest {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    public void solutionTest(int[] arr1, int[] arr2, double expectedDouble) {
        Solution solution = new Solution();
        double actual = solution.solution(arr1, arr2);
        assertEquals(expectedDouble, actual);
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, new int[]{4, 5, 6}, 9.0),
                Arguments.of(new int[]{10, 20, 10, 2}, new int[]{10, 25, 5, -2}, 16.5),
                Arguments.of(new int[]{0, -1}, new int[]{-1, 0}, 1.0),
                Arguments.of(new int[]{10, 10}, new int[]{10, 10}, 0.0)

        );
    }

    @Test
    public void randomSolutionTest() {
        Solution solution = new Solution();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int[] arr1 = generateRandomArray(random);
            int[] arr2 = generateRandomArray(random);

            double result = solution.solution(arr1, arr2);

            assertTrue(result >= 0);
        }
    }

    private int[] generateRandomArray(Random random) {
        int length = random.nextInt(10) + 1;
        return IntStream.generate(() -> random.nextInt(20) - 10)
                .limit(length)
                .toArray();
    }
}