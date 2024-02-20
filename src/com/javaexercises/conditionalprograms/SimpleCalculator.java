package com.javaexercises.conditionalprograms;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        // A Calculator that takes 2 numbers & performs operations. 'x' or 'X' to exit app.

        Scanner input = new Scanner(System.in);
        int result = 0;

        while (true) {
            System.out.print("Enter desired operator (+, - , *, /, %): ");
            char operator = input.next().trim().charAt(0);
            // Take the operator as input
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
                System.out.print("Enter Number 1: ");
                int number1 = input.nextInt();
                System.out.print("Enter Number 2: ");
                int number2 = input.nextInt();

                if (operator == '+') {
                    result = number1 + number2;
                }
                if (operator == '-') {
                    result = number1 - number2;
                }
                if (operator == '*') {
                    result = number1 * number2;
                }
                if (operator == '/') {
                    if (number2 != 0) {
                        result = number1 / number2;
                    }
                }
                if (operator == '%') {
                    result = number1 % number2;
                }
            } else if (operator == 'x' || operator == 'X') {
                break;
            } else {
                System.out.println("Invalid Operation!");
            }
            System.out.println("Result: " + result);
        }
    }
}
