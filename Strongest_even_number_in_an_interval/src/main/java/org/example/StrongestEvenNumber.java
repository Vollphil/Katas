package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class StrongestEvenNumber {
    public int strongestEven(int n,int m){
        ArrayList<Integer> numbers  = new ArrayList<>();
        ArrayList<Integer> index = new ArrayList<>();
        for(int i = n; i <= m;i++){
            if(i % 2 == 0) {
                numbers.add(divideByTwo(i));
                index.add(i);
            }

        }
        return index.get(numbers.indexOf(Collections.max(numbers)));



    }

    public int divideByTwo(int number){

        int counter = 0;

        while(number % 2 == 0){
            counter++;
           number = number / 2;
        }
        return counter;
    }



}
