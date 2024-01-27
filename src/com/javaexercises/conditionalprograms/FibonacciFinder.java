package com.javaexercises.conditionalprograms;

import java.util.Scanner;

public class FibonacciFinder {
    public static void main(String[] args) {
        // Find the Fibonacci number for 'nth' term

        Scanner input = new Scanner(System.in);
        System.out.print("Enter value for n: ");
        int n = input.nextInt();
        int firstValue = 0;
        int nextValue = 1;
        int count = 2;

        // count is used to find the sum
        while (count <= n) {
            int tempValue = nextValue;
            nextValue = nextValue + firstValue;
            firstValue = tempValue;
            count++;
        }

        System.out.println(nextValue);
    }
}
