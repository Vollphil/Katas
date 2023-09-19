package org.example;

import java.util.List;

public class DingleMouse {

    public int countDeafRats(final String town) {
        int piperPosition = 0;
        int deafRats = 0;
        if (town.contains("P")) {
            piperPosition = town.indexOf("P");
        }

        if (piperPosition == 0) {

            String[] rats = town.split("O~");
            int count = 0;
            for (String rat : rats) {
                if (rat.equals("~O")) {
                    count++;
                }

            }
            deafRats = count;
        } else if (town.endsWith("P")) {

            String[] rats = town.split("~O");
            int count = 0;
            for (String rat : rats) {
                if (rat.equals("O~")) {
                    count++;
                }
                deafRats = count;
            }


        }
        return deafRats;
    }
}
