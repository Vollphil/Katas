package org.example;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target){
        int[] answerArray = {};
        int number = 0;
        int counter = 0;
        boolean checkIfAlreadyAdded = false;


        while( !checkIfAlreadyAdded) {
            for(int i = 0; i < numbers.length;i++){
                if (i == 0){
                number = numbers[counter];

            }
            if(number + numbers[i] == target && counter != i){
                checkIfAlreadyAdded = true;
                answerArray = new int[]{counter,i};

            }if(i == numbers.length-1 && number +numbers[i] !=target){
                    counter++;

                }

                System.out.println(counter);
        }
        }
        return answerArray;
    }
}
