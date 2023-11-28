package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DeadFishTest {

    @ParameterizedTest
    @MethodSource("provideTestCases")
    public void testDeadFishMethod(String data, int[] expectedArray) {
        DeadFish deadFish = new DeadFish();
        assertArrayEquals(expectedArray, deadFish.parse(data));
    }
private static Stream<Arguments> provideTestCases(){
    return Stream.of(
            Arguments.of("iiisdoso", new int[] {8, 64}),
            Arguments.of("iiisdosodddddiso", new int[] {8, 64,3600}),
            Arguments.of("iiiisdoofoasgafgiisofasfi", new int[] {15, 15, 15, 51529})
    );

}
}