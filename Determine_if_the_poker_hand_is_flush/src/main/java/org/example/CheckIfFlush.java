package org.example;

import java.util.Arrays;

public class CheckIfFlush {

    public boolean checkIfFlush(String[] cards){

        String[] flush = new String[]{"H","S","D","C"};
        String color = "";
        for (int i = 0; i < flush.length;i++){
            if(cards[0].endsWith(flush[i])){
                color = flush[i];
                break;
            }


        }
        for(int j = 0; j < cards.length;j++){
            if(!cards[j].endsWith(color)){
                return false;
            }
        }
        return true;
    }
}
