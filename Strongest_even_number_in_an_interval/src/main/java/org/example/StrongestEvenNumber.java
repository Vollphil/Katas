package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class StrongestEvenNumber {
    public int strongestEven(int n,int m){


        int dividedNumber = 0;
        int strongestNumber = 0;
        int start = n % 2 == 0 ? n : n + 1;
        for(int i = start; i <= m;i++){
            if( divideByTwo(i) > dividedNumber ) {
                dividedNumber = divideByTwo(i);
                strongestNumber = i;

            }

        }
        return strongestNumber;



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
