package org.example;

import java.util.ArrayList;
import java.util.List;

public class SpinWords {

    public String spinWords(String sentence){
        ArrayList<String> sentenceArray = new ArrayList<>(List.of(sentence.split(" "))) ;
        for(int i = 0; i < sentenceArray.size(); i++){
            StringBuilder reversedString = new StringBuilder();
           if(sentenceArray.get(i).length() >= 5){
               reversedString.append(sentenceArray.get(i));
               reversedString = reversedString.reverse();
               sentenceArray.set(i, String.valueOf(reversedString));
           }
        }
        return String.join(" ",sentenceArray);
    }
}
