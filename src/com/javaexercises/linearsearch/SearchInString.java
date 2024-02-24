package com.javaexercises.linearsearch;

public class SearchInString {
    public static void main(String[] args) {
        // Search for a character in a string.
        String name = "Kane";
        char targetChar = 'w';
        System.out.println(name);
        System.out.println("target char: " + targetChar);
        System.out.println(linearSearch(name, targetChar));
    }

    static boolean linearSearch(String str, char target) {
        // Check for null String
        if (str.length() == 0) {
            return false;
        }

        // Check if target is present
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
