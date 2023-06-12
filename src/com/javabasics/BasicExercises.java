package com.javabasics;

import java.util.Scanner;

public class BasicExercises {
    public static void main(String[] args) {
//        URL : https://www.w3resource.com/java-exercises/basic/index.php
//        <==== Java Basic Programming : Exercises ====>

//        1. Write a Java program to print 'Hello' on screen and your name on a separate line.
//        System.out.println("Hello\nKaushik Iroshan");

//        2. Write a Java program to print the sum of two numbers.
        /*
            Test Data:
            74 + 36
            Expected Output :
            110


            int number;
            int number2;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter first number:");
            number = input.nextInt();
            System.out.println("Enter second number:");
            number2 = input.nextInt();
            System.out.println("Sum of both numbers: " + (number + number2));

         */

//          3. Write a Java program to divide two numbers and print them on the screen.
        /*
            Test Data :
            50/3
            Expected Output :
            16


            int number1 = 50;
            int number2 = 3;

            System.out.println(number1 / number2);

         */

//        4. Write a Java program to print the results of the following operations.
        /*
        Test Data:
            a. -5 + 8 * 6
            b. (55+9) % 9
            c. 20 + -3*5 / 8
            d. 5 + 15 / 3 * 2 - 8 % 3


        System.out.println("a = " + (-5 + 8 * 6));
        System.out.println("b = " + ((55 + 9) % 9));
        System.out.println("c = " + (20 + -3 * 5 / 8));
        System.out.println("d = " + (5 + 15 / 3 * 2 - 8 % 3));

         */

//        5. Write a Java program that takes two numbers as input and displays the product of two numbers.
        /*
        Test Data:
            Input first number: 25
            Input second number: 5
            Expected Output :
            25 x 5 = 125
         */

        int firstNumber;
        int secondNumber;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        firstNumber = input.nextInt();
        System.out.println("Enter second number: ");
        secondNumber = input.nextInt();

        System.out.println(firstNumber + " x " + secondNumber + " = " + (firstNumber * secondNumber));
    }
}
