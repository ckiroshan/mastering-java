package com.javaexercises.simpleprograms;

import java.util.Scanner;

public class FibonacciSeriesCalculator {
    public static void main(String[] args) {
        // To calculate Fibonacci Series up to n numbers.
        // Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

        Scanner input = new Scanner(System.in);
        int firstTerm = 0;
        int secondTerm = 1;
        int n;

        System.out.print("Enter value for 'n': ");
        n = input.nextInt();

        System.out.println("Fibonacci Series up to " + n + ": ");
        for (int i = 0; i <= n; i++) {
            System.out.print(firstTerm + ", ");
            int sum = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = sum;
        }

    }
}
