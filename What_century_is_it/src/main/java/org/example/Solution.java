package org.example;

import java.util.ArrayList;

import java.util.List;

public class Solution {

    public String whatCentury(int year) {
            String stringYear = "";
            if (year <= 999) {
                stringYear = "0" + year;
            } else {
                stringYear = "" + year;
            }

            ArrayList<String> yearSplit = new ArrayList<>(List.of(stringYear.split("")));
            int firstTwoNumbers = Integer.parseInt(yearSplit.get(0) + yearSplit.get(1));

            int secondNumber = Integer.parseInt(yearSplit.get(1));
            int lastTwoNumbers = Integer.parseInt(yearSplit.get(2)+yearSplit.get(3));
            String century = "";
            System.out.println(lastTwoNumbers);

            if (firstTwoNumbers < 10 ) {
                century = "0" + (secondNumber) + switchCaseForDateShortCut(secondNumber);
                System.out.println("this if sentence works");
            }
            if(lastTwoNumbers < 1){
                century = firstTwoNumbers +switchCaseForDateShortCut(firstTwoNumbers);
            }
            else{
                century = (firstTwoNumbers + 1) + switchCaseForDateShortCut(firstTwoNumbers + 1);
            }



            return century;
    }

    public String switchCaseForDateShortCut(int number) {
        String shortCut = "";
        String splitNumber = "";
        if(number >= 20){
            splitNumber = ""+number;
           String firstChar = ""+ splitNumber.charAt(0);
           number = Integer.parseInt(splitNumber.replaceFirst(firstChar,""));
        }
        switch (number) {
            case 0, 4, 5, 6, 7, 8, 9 -> shortCut = "th";
            case 1 -> shortCut = "st";
            case 2 -> shortCut = "nd";
            case 3 -> shortCut = "rd";
            default -> shortCut ="th";
        }
        return shortCut;
    }

}
