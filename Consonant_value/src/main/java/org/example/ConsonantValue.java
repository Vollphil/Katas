package org.example;


import java.util.Arrays;

public class ConsonantValue {

    public void consonantValue(String s) {
        String[] sArray = s.split("[aeiou]");

        for (String sAr : sArray) {
           numerate(sAr);

        }


    }

    public int numerate(String str) {
        char c = str.charAt(0);
        if (c >= 'a' && c <= 'z') {
            return c - 'a' + 1;
        } else {
            return -1;
        }
    }
}
