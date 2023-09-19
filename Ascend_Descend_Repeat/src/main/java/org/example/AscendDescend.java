package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AscendDescend {

    public String ascendDescend(int length,int minimum,int maximum){
        List<Integer> ascDesc = new ArrayList<>();
        for(int i = 1; i <length+1; i++){
            if(ascDesc.isEmpty()) {
                ascDesc.add(minimum);
            } else if ( ascDesc.indexOf(maximum+1) != maximum) {
                ascDesc.add(minimum +i-1);


            } else if (ascDesc.indexOf(maximum+1) == maximum) {
                for(int j = maximum -1; j > minimum;j--){
                    ascDesc.add(maximum -j +1);
                }

            }
        }

        return ascDesc.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(""));
    }
}
