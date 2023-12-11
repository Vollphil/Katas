package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public String whoLikesIt(String... names){
        ArrayList<String> namesList =  new ArrayList<>(Arrays.asList(names));
        String whoLikesIt = "";
        int peopleInList = namesList.size();


        switch(peopleInList){
            case 0 -> whoLikesIt = "no one like this";
            case 1 -> whoLikesIt = namesList.get(0) + " like this";
            case 2 -> whoLikesIt = namesList.get(0) + " and "+ namesList.get(1) +" like this";
            case 3 -> whoLikesIt = namesList.get(0) + ", " +namesList.get(1) + " and " +namesList.get(2)+" like this";
            default -> whoLikesIt = namesList.get(0) + ", " + namesList.get(1) + " and " + (namesList.size() -2)+ " others like this";
        }
        return whoLikesIt;
    }
}
