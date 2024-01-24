package com.javaexercises.simpleprograms;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        // To find out whether the given String is Palindrome or not.
        // Palindromic strings are “anna,” “civic,” “level,” “mom,” “noon,” and “racer.”

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.next();
        String reverseWord = "";

        int wordLength = word.length();

        for (int i = (wordLength - 1); i >= 0; --i) {
            reverseWord = reverseWord + word.charAt(i);
        }

        if (word.equalsIgnoreCase(reverseWord)) {
            System.out.println(word + " is a Palindrome String.");
        } else {
            System.out.println(word + " is not a Palindrome String.");
        }
    }
}
