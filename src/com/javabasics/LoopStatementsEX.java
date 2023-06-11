package com.javabasics;

public class LoopStatementsEX {

    public static void main(String[] args) {
        
//        For Loops

//      (     starting point; When it should End; How many x it loops;    )
        for (int initial = 0; initial < 5; initial++) {
            System.out.println("Hey Bruh!");
        }

//        Exercises
//        (1) Write a program that prints all the even numbers from 1 to 10.
        System.out.println("Even Numbers from 0 - 10");
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
        System.out.println(" ");

//        (2) Write a program that prints all the odd numbers from 1 to 10.
        System.out.println("Odd Numbers from 0 - 100");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }
        System.out.println(" ");

//        While Loops
        System.out.println("While Loops");
        int number = 5;
        while (number > 0) {
            System.out.println("Hi there!");
            number--;
        }
        System.out.println(" ");

//        Exercise (1)
        /*
        1. The customer wants to deposit his cash in hand to bank.
        2. Each time he visits the bank, he deposits $10 to his account.
        3. When his balance is 0. The deposit machine says "Insufficient balance!"
         */

        int cash = 100;
        while (cash > 0) {
            System.out.println("Current Cash balance: $" + cash);
            System.out.println("Deposited $10 to Bank account!");
            cash -= 10;
        }
        if (cash == 0) {
            System.out.println("Current Cash balance: $" + cash);
            System.out.println("Sorry, Insufficient balance to deposit!");
        }
        System.out.println(" ");

//        Do while Loops
        System.out.println("Do-while loops");
        int number1 = 3;
        do {
            System.out.println("Do-while test loop");
            number1--;
        } while (number1 > 0);
        System.out.println(" ");

//        Exercise (1) -
        int guest = 3;
//        Regardless of "if guest orders food or not". Waiter would ask this for all guests.
        do {
            System.out.println("What would you like sir!");
            guest--;
        } while (guest > 0);
        System.out.println(" ");

//        For-each loops (exclusive to JAVA)
        System.out.println("For-each loop");
//        Used to iterate arrays.

        String[] vegetables = {"Carrots", "Beans", "Potatoes", "Onions"};

        for (String vegetable : vegetables) {
            System.out.println(vegetable);
        }
    }
}
