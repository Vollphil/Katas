package org.example;

import java.util.Arrays;

public class VowelRemover {

    public String shortcut(String input){
        String[] array = input.split("[aeiou]");
        return String.join("",array);
    }

}
