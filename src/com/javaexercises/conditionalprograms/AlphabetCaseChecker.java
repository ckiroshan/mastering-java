package com.javaexercises.conditionalprograms;

import java.util.Scanner;

public class AlphabetCaseChecker {
    public static void main(String[] args) {
        // Check if a char is uppercase or lowercase.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char character = input.next().trim().charAt(0);

        if (character >= 'a' && character <= 'z') {
            System.out.println("Lowercase letter");
        } else {
            System.out.println("Uppercase letter");
        }
    }
}
