package org.example;

import java.util.ArrayList;
import java.util.List;

public class CamelCase {

    public String camelCase(String input) {

        String upperCaseLetter = "";

        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i)) && !("" + input.charAt(i - 1)).equals(" ")) {
                upperCaseLetter = "" + input.charAt(i);
                input = input.replace(upperCaseLetter, " " + upperCaseLetter);
            }
        }
        return input;

    }
}
