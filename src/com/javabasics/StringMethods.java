package com.javabasics;

@SuppressWarnings("ConstantConditions")
public class StringMethods {
    public static void main(String[] args) {

        String firstName = "Kane";

        boolean result = firstName.equals("Kane");
        boolean result2 = firstName.equals("kane");
        boolean result3 = firstName.equalsIgnoreCase("kane");
        int firstNameLength = firstName.length();
        String firstNameUp = firstName.toUpperCase();
        String firstNameLow = firstName.toLowerCase();

        System.out.println("Is First Name =? " + result);
        System.out.println("Is First Name =? " + result2);
        System.out.println("Is First Name =? " + result3);
        System.out.println("First Name Length = " + firstNameLength);
        System.out.println("First Name Uppercase = " + firstNameUp);
        System.out.println("First Name Lowercase = " + firstNameLow);

        // Creating a String object
        String originalString = "Hello";
        String concatenatedString = originalString + " World";
        originalString = "New Value"; // Reassigned the reference value

        // Displaying the original and concatenated strings
        System.out.println("Original String: " + originalString);
        System.out.println("Concatenated String: " + concatenatedString);
    }
}
