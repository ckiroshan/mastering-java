package com.javabasics;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
//        Scanner

      /*
        String stringValue;
        Scanner input = new Scanner(System.in); // Once 'input' object is created. It can be used multiple times.
        System.out.println("Enter your name: ");
        stringValue = input.nextLine(); // This line can be used get input from user.
        System.out.println("Hi, " + stringValue + "!");
        System.out.println("Name in Uppercase: " + stringValue.toUpperCase());
        System.out.println("Length of Name: " + stringValue.length());
      */


        int number1;
        int number2;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        number1 = input.nextInt();
        System.out.println("Enter Number 2: ");
        number2 = input.nextInt();
        System.out.println("The sum of Numbers: " + (number1 + number2));

    }
}
