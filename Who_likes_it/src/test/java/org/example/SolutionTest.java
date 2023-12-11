package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @ParameterizedTest
    @MethodSource("provideStringsForWhoLikesIt")
    public void whoLikesItTest(String[] names, String expectedString){
        Solution solution = new Solution();
        assertEquals(expectedString,solution.whoLikesIt(names));

    }
    private static Stream<Arguments> provideStringsForWhoLikesIt() {
        return Stream.of(
                Arguments.of(new String[]{}, "no one like this"),
                Arguments.of(new String[]{"Peter"}, "Peter like this"),
                Arguments.of(new String[]{"Peter", "Paul"}, "Peter and Paul like this"),
                Arguments.of(new String[]{"Max", "John", "Mark"}, "Max, John and Mark like this"),
                Arguments.of(new String[]{"Alex", "Jacob", "Mark", "Max"}, "Alex, Jacob and 2 others like this"),
                Arguments.of(new String[]{"Brian", "Marilyn", "Pamela", "Timothy", "Jesse", "Heather", "Terry", "Carlos",
                        "Bonnie", "Randy", "Lillian", "Emily", "Louis", "Chris", "Howard", "Helen", "Ralph", "Jennifer", "Mark", "Laura"}, "Brian, Marilyn and 18 others like this")
        );
    }
}