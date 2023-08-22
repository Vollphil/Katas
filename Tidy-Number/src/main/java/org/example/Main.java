package org.example;

public class Main {


    public static boolean tidyNumber(int number) {

        String numberString = Integer.toString(number);
        char[] digits = numberString.toCharArray();

        for (int i = 0; i < digits.length - 1; i++) {

            if (digits[i] > digits[i + 1]) {
                return false;
            }

        }
        return true;


    }


}
