package com.javaexercises.patternprogram;

public class NumberPyramid {
    public static void main(String[] args) {
        int row = 6; // Number of rows in the pattern
        int column = 5; // Number of columns (not used)

        // Loop to print the ascending sequence of numbers in the first half
        for (int count = 1; count <= row; count++) {
            // Inner loop to print numbers in each row
            for (int counted = 1; counted <= count; counted++) {
                System.out.print(counted); // Print the current number in the sequence
            }
            System.out.println(); // Move to the next line after each row
        }

        // Loop to print the descending sequence of numbers in the second half
        for (int reverseCount = row - 1; reverseCount >= 1; reverseCount--) {
            // Inner loop to print numbers in each row
            for (int reverseCounted = 1; reverseCounted <= reverseCount; reverseCounted++) {
                System.out.print(reverseCounted); // Print the current number in the sequence
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
