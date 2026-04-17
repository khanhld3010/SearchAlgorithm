package HighestString;

public class Main {
    static void main(String[] args) {
        HighestString highestString = new HighestString();
        String input = "Welcome";
        char[] inputCharArray = input.toCharArray();
        System.out.println(highestString.newString(inputCharArray));
    }
}