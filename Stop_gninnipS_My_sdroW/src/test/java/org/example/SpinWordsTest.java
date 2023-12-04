package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SpinWordsTest {

@ParameterizedTest
@MethodSource("provideTestCases")
    public void spinWordsTest(String input,String expected ){
SpinWords spinWords = new SpinWords();
assertEquals(expected,spinWords.spinWords(input));
}
static Stream<Arguments> provideTestCases(){
return Stream.of(
        Arguments.of("Welcome","emocleW"),
        Arguments.of("Hey fellow warriors","Hey wollef sroirraw"),
        Arguments.of("This is a test","This is a test"),
        Arguments.of("This is another test","This is rehtona test"),
        Arguments.of("This sentence is a sentence","This ecnetnes is a ecnetnes")

);
}
}