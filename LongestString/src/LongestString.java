import java.util.List;

public class LongestString {
    public String longestString(String str) {
        char[] charArr = str.toCharArray();
        String longestString = "";
        String currentString = "";
        char firstChar = charArr[0];
        currentString += firstChar;
        for (int i = 1; i < charArr.length; i++) {
            if (firstChar < charArr[i]) {
                currentString += charArr[i];
                firstChar = charArr[i];
            } else if (firstChar >= charArr[i]) {
                if (currentString.length() > longestString.length()) {
                    longestString = currentString;
                }
                currentString = "";
                currentString += charArr[i];
                firstChar = charArr[i];
            }
        }
        if (currentString.length() > longestString.length()) {
            longestString = currentString;
        }
        return longestString;
    }
}
