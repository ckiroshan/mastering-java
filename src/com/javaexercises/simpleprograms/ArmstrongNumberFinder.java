package com.javaexercises.simpleprograms;

import java.util.Scanner;

public class ArmstrongNumberFinder {
    public static void main(String[] args) {
        // To find all Armstrong numbers between 2 given numbers.

        Scanner input = new Scanner(System.in);
        int number1;
        int number2;

        System.out.print("Input value for number 1: ");
        number1 = input.nextInt();
        System.out.print("Input value for number 2: ");
        number2 = input.nextInt();

        System.out.println("Armstrong numbers between " + number1 + " and " + number2 + " are:");

        for (int i = number1; i <= number2; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }

    }

    private static boolean isArmstrong(int num) {
        int sum = 0;
        int temp = num;
        int numberOfDigits = (int) Math.log10(temp) + 1;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numberOfDigits);
            temp /= 10;
        }

        return num == sum;
    }
}
