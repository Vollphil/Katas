package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AscendDescend {

    public String ascendDescend(int length, int minimum, int maximum) {
        List<Integer> ascDesc = new ArrayList<>();
        int i = minimum;

        boolean turnAround = false;
        if(minimum <=0){
            turnAround = true;
        }
        while (ascDesc.size() != length) {
            if(i == maximum){
                turnAround = true;
            }
           if(i == minimum){
               turnAround = false;
            }
           if(!turnAround){
               ascDesc.add(i++);
           }if(turnAround){
               ascDesc.add(i--);
            }
        }


        String result = ascDesc.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
        return result;
    }
}
