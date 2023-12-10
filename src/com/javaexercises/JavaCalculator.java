package com.javaexercises;

import java.util.Scanner;

public class JavaCalculator {
    public static void main(String[] args) {
        System.out.println("Hey there!");

//        Create a calculator
//        Takes 2 numbers. based on user's chosen assignment operator
//        Make changes to the numbers.

        int number1;
        int number2;
        String symbol;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a value for Number 01: ");
        number1 = input.nextInt();
        System.out.println("Enter a value for Number 02: ");
        number2 = input.nextInt();
        System.out.println("Select the correct operator symbol: + - * /");
        input.nextLine(); //Skips the first next line operation. (clears the scanner)
        symbol = input.nextLine();

        switch (symbol) {
            case "+" -> System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
            case "-" -> System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
            case "*" -> System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
            case "/" -> System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
            case "%" -> System.out.println(number1 + " % " + number2 + " = " + (number1 % number2));
            default -> System.out.println("Error!");
        }

    }
}
