package org.example;


import java.util.ArrayList;
import java.util.Arrays;

public class SumSquaredDivisors {

    public String listSquared(long m, long n) {

        ArrayList<ArrayList<Long>> finalArray = new ArrayList<>();

        for (long i = m; i < n; i++) {
            if (isPerfectSquare(getSquaredDivisorsOfANumber(i)) && i != 1) {
                ArrayList<Long> pair = new ArrayList<>(Arrays.asList(i, getSquaredDivisorsOfANumber(i)));
                finalArray.add(pair);
            }
            if (m == 1 && i == 1) {
                finalArray.add(new ArrayList<>(Arrays.asList(1L, 1L)));
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (ArrayList<Long> pair : finalArray) {
            sb.append(pair.toString());
            sb.append(", ");
        }
        if (!finalArray.isEmpty()) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");

        return sb.toString();

    }


    public boolean isPerfectSquare(long number) {
        if (number < 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(number);
        return number == (long) sqrt * sqrt;
    }

    public long getSquaredDivisorsOfANumber(long number) {
        ArrayList<Long> SquaredDivisorNumbers = new ArrayList<>();
        for (long i = 1; i < number; i++) {
            if (number % i == 0) {
                SquaredDivisorNumbers.add(i * i);
            }
            if (!SquaredDivisorNumbers.contains(number * number)) {
                SquaredDivisorNumbers.add(number * number);
            }
        }
        long sum = SquaredDivisorNumbers.stream()
                .reduce(0L, Long::sum);
        System.out.println(sum);
        return sum;
    }

}
