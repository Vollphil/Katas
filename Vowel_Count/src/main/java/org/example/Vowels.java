package org.example;

import java.util.Arrays;

public class Vowels {

    public int getCount(String str) {
        int count = 0;
        str = str.toLowerCase();
        String[] array = str.split("");
        for (String vowel : array) {
            switch (vowel) {
                case "a", "i", "e", "o", "u" -> count++;
            }
        }
        return count;

    }


}
