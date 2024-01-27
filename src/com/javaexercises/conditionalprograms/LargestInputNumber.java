package com.javaexercises.conditionalprograms;

import java.util.Scanner;

public class LargestInputNumber {
    public static void main(String[] args) {
        // Find the largest of 3 numbers.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter value 1: ");
        int a = input.nextInt();
        System.out.print("Enter value 2: ");
        int b = input.nextInt();
        System.out.print("Enter value 3: ");
        int c = input.nextInt();

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println(max);
    }
}
