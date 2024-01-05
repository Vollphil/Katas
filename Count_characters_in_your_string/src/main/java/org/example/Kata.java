package org.example;

import java.util.*;

public class Kata {

    public Map<Character, Integer> count(String str) {

        Map<Character, Integer> result = new HashMap<>();

        String fullString = str;
        while (!fullString.isEmpty()) {

            String firstChar = fullString.charAt(0) + "";
            int number = countLetters(fullString);

            result.put(fullString.charAt(0), number);
            fullString = fullString.replaceAll(firstChar, "");
            System.out.println(fullString);
        }
        return result;
    }

    public int countLetters(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            String firstLetter = str.charAt(0) + "";
            if (firstLetter.equals(str.charAt(i) + "")) {
                counter++;
            }

        }

        return counter;
    }
}
