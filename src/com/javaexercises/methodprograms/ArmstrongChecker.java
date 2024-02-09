package com.javaexercises.methodprograms;

import java.util.Scanner;

public class ArmstrongChecker {
    public static void main(String[] args) {
        // Check if a number is an armstrong number or not
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number!");
        } else {
            System.out.println(number + " is not an Armstrong number!");

        }
    }

    private static boolean isArmstrong(int n) {
        int originalNumber = n;
        int sum = 0;

        while (n > 0) {
            int remainder = n % 10;
            n = n / 10;
            sum = sum + remainder * remainder * remainder;

        }
        return sum == originalNumber;
    }
}
