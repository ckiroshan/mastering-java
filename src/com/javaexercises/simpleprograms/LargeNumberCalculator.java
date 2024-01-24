package com.javaexercises.simpleprograms;

import java.util.Scanner;

public class LargeNumberCalculator {
    public static void main(String[] args) {
        // Take 2 numbers as input and print the largest number.

        Scanner input = new Scanner(System.in);
        int number1;
        int number2;

        // Take input
        System.out.print("Enter value for Number 1: ");
        number1 = input.nextInt();
        System.out.print("Enter value for Number 2: ");
        number2 = input.nextInt();

        int highestNumber = Math.max(number1, number2);
        System.out.println("The largest number is: " + highestNumber);
    }
}
