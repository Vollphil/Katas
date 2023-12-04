package org.example;

public class Solution {

    public String toCamelCase(String s) {

        while (s.contains("-") || s.contains("_")) {


            if (s.contains("_")) {
                String underscore = "" + s.charAt(s.indexOf("_"));
                int indexOfUnderscore = s.indexOf("_");
                String firstPart = s.substring(0, indexOfUnderscore + 1);
                String upperCaseLetter = s.substring(indexOfUnderscore + 1, indexOfUnderscore + 2).toUpperCase();
                String secondPart = s.substring(indexOfUnderscore + 2, s.length());


                s = firstPart + upperCaseLetter + secondPart;
                s = s.replaceFirst(underscore, "");
            }
            if (s.contains("-")) {
                String dash = "" + s.charAt(s.indexOf("-"));

                int indexOfDash = s.indexOf("-");
                String firstPart = s.substring(0, indexOfDash + 1);
                String upperCaseLetter = s.substring(indexOfDash + 1, indexOfDash + 2).toUpperCase();
                String secondPart = s.substring(indexOfDash + 2, s.length());


                s = firstPart + upperCaseLetter + secondPart;
                s = s.replaceFirst(dash, "");

            }

        }
        return s;
    }
}
