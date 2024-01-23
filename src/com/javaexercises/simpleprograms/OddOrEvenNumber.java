package com.javaexercises.simpleprograms;

import java.util.Scanner;

public class OddOrEvenNumber {
    public static void main(String[] args) {
        /* Write a program to print whether a number is even or odd,
        also take input from the user.*/

        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter a value : ");
        number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else if (number == 1) {
            System.out.println("Not Even/Odd Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}
