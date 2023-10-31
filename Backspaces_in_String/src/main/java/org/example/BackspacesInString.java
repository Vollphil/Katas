package org.example;


import java.util.ArrayList;
import java.util.List;

public class BackspacesInString {
    public String cleanString(String s) {
        ArrayList<String> sArray = new ArrayList<>(List.of(s.split("")));

while(sArray.contains("#")) {
    for (int i = 0; i < sArray.size(); i++) {
        int hashtagIndex = 0;
        if (sArray.get(i).equals("#") && sArray.indexOf("#") != 0) {
            hashtagIndex =  sArray.indexOf("#");
            sArray.remove(hashtagIndex);
            sArray.remove(hashtagIndex - 1);

            break;
        }
        if (sArray.get(i).equals("#") && sArray.indexOf("#") == 0) {
            hashtagIndex = sArray.indexOf("#");
            sArray.remove(hashtagIndex);
            break;
        }
    }

}

        s = String.join("",sArray);

        return s;
    }
}
