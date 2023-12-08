package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    public void testWhatCentury(int year, String expectedString) {
        Solution solution = new Solution();
        assertEquals(expectedString,solution.whatCentury(year));

      }

      private static Stream<Arguments> provideTestCases(){
return Stream.of(
        Arguments.of(1999, "20th"),
        Arguments.of(2011, "21st"),
        Arguments.of(2154, "22nd"),
        Arguments.of(2259, "23rd"),
        Arguments.of(1124, "12th"),
        Arguments.of(2000, "20th"),
        Arguments.of(1010, "11th")
);
      }
}