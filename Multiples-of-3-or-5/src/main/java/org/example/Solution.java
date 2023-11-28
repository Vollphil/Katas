package org.example;

import java.util.ArrayList;


public class Solution {
    public int solution(int number) {
        int three = 3;
        int five = 5;
        int sum = 0;
        int i = 0;
        ArrayList<Integer> multiples = new ArrayList<>();
        while (three * i < number || five * i < number) {
            i++;
            if (three * i < number && !multiples.contains(three * i)) {
                multiples.add(three * i);
            }
            if (five * i < number && !multiples.contains(five * i)) {
                multiples.add(five * i);
            }
        }

        sum = multiples.stream()
                .reduce(0, Integer::sum);

        return sum;

    }
}
