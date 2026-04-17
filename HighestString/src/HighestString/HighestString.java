package HighestString;

import java.util.ArrayList;
import java.util.List;

public class HighestString {
    public String newString(char[] inputCharArray) {
        String newString = "";
        char compareMax = inputCharArray[0];
        newString += compareMax;
        for (char c : inputCharArray) {
            if (compareMax < c) {
                compareMax = c;
                newString += c;
            }
        }
        return newString;
    }
}
