package org.example;


import java.util.ArrayList;


public class Solution {
    public double solution(int[] arr1,int[] arr2){
        ArrayList<Double> arr3 = new ArrayList<>();
        int arrayLength = 0;
        for(int i = 0; i < arr1.length;i++){
            if(arr1[i] != arr2[i]){
                 arr3.add((double) Math.abs(arr1[i]-arr2[i]) * (double) Math.abs(arr1[i]-arr2[i]));
            }else{
                arr3.add((double) 0);
            }
            arrayLength = arr3.size();

        }

        int finalArrayLength = arrayLength;

       double solution = arr3.stream().reduce((double)0, Double::sum);

        return solution / finalArrayLength;
    }


}
