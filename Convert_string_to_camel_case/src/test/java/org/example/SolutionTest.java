package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
@ParameterizedTest
    @MethodSource("provideTestCases")
public void testSolution(String input,String expectedString){
Solution solution = new Solution();
assertEquals(expectedString,solution.toCamelCase(input));

}
    static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of("the-stealth-warrior", "theStealthWarrior"),
                Arguments.of("The-Stealth-Warrior", "TheStealthWarrior"),
                Arguments.of("the_stealth_warrior", "theStealthWarrior"),
                Arguments.of("The_Stealth_Warrior", "TheStealthWarrior"),
                Arguments.of("You_have_chosen_to_translate_this_kata_For_your_convenience_we_have_provided_the_existing_test_cases_used_for_the_language_that_you_have_already_completed_as_well_as_all_of_the_other_related_fields","YouHaveChosenToTranslateThisKataForYourConvenienceWeHaveProvidedTheExistingTestCasesUsedForTheLanguageThatYouHaveAlreadyCompletedAsWellAsAllOfTheOtherRelatedFields")

        );
    }

}