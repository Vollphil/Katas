package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MexicanWaveTest {
@ParameterizedTest
    @CsvSource({
            "'hello','Hello,hEllo,heLlo,helLo,hellO'",
            "'test','Test,tEst,teSt,tesT'",
            "'codewars','Codewars,cOdewars,coDewars,codEwars,codeWars,codewArs,codewaRs,codewarS'",
            "'hey there','Hey there,hEy there,heY there,hey There,hey tHere,hey thEre,hey theRe,hey therE'",
            "'',''"

    })

    void testMexicanWave(String input,String expected){
    MexicanWave mexicanWave = new MexicanWave();
    String[] result = mexicanWave.wave(input);
    String resultAsString = String.join(",",result);
    assertEquals(expected,resultAsString);
}

}