package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MexicanWave {

    public String[] wave(String str){

        if (str.isEmpty()) {
            return new String[0];
        }
        String[] split = str.split("");
        List<String> wave = new ArrayList<>();


            for (int i = 0; i < split.length; i++) {

                if (!split[i].equals(" ")) {
                    String uppercase = str.substring(0, i) + split[i].toUpperCase() + str.substring(i + 1);
                    wave.add(uppercase);
                }
            }




        return wave.toArray(new String[0]);

    }
}
