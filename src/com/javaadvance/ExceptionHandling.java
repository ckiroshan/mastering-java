package com.javaadvance;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {

        // Try & Catch block
        try {
            int number;
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter a value: ");
            number = input.nextInt();
            System.out.println("Entered value is: " + number);
            // Checks if code is correct
        } catch (Exception e) {
            // e: object instance of "Exception" class
            System.out.println("Only enter numbers!");
        } finally {
            System.out.println("finally block is always executed!");
        }

        // Throw block
        try {
            int number = 10;
            if (number == 10)
                throw new Exception();
        } catch (Exception e) {
            System.out.println("User created exception!");
        }
    }
}
