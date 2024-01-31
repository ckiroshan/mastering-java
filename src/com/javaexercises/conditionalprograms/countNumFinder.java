package com.javaexercises.conditionalprograms;

import java.util.Scanner;

public class countNumFinder {
    public static void main(String[] args) {
        // Find how many times 'specialNumber' occurs in a long.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a long value : ");
        long number = input.nextLong();
        System.out.print("Enter the Special Number you need : ");
        int specialNumber = input.nextInt();

        int count = 0;
        long tempNumber = number;
        while (tempNumber > 0) {
            long remainder = tempNumber % 10;
            if (remainder == specialNumber) {
                count++;
            }
            tempNumber = tempNumber / 10;
        }

        System.out.println(specialNumber + " occurred " + count + "x times in " + number);
    }
}
