package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class DeadFish {

    public int[] parse(String data){
        ArrayList<Integer> parsedString= new ArrayList<>();
        int number = 0;

        for(int i = 0; i< data.length();i++){
            String letter = ""+data.charAt(i);
            switch(letter) {
                case "i":
                    number++;
                    break;
                case "d":
                    number--;
                    break;
                case "s":
                    number = number * number;
                    break;
                case"o":

                    parsedString.add(number);
                    break;
                default:
                    break;
            }
        }
       int[] solution = new int[parsedString.size()];
        for (int i = 0; i < parsedString.size(); i++) {
            solution[i] = parsedString.get(i);
        }

        return  solution;
    }

}
