package com.javabasics;

public class LoopStatements {
    public static void main(String[] args) {
//        Loop statements
        // Can be used to print something multiple times using a single loop.

//        For loop - increment
        for (int initial = 0; initial < 1; initial++) {
//      for (loop start value, when loop ends, number increment)
//            Can be used when start value is known.
            System.out.println("Hi Dude");
        }
        System.out.println(" ");
//        For loop - decrement
        for (int i = 1; i > 0; i--) {
            System.out.println("Hey Bro");
        }

        System.out.println(" ");

//       While loop
        int number = 2;
        while (number > 0) { // Will execute 2x. When x = 0, loop ends
//            Can be used when start value is not known (Declared above somewhere)
            System.out.println("While loop value: " + number);
            number--;
        }

        System.out.println(" ");

//       Do-while loop
        int number1 = 2;
        do {
            // Gets executed once even if condition is false. (compared to while loop)
            System.out.println("Do-while loop value: " + number1);
            number1--;
        } while (number1 > 0);

        System.out.println(" ");

//        For-each loop - can use to iterate arrays

        // Using For loop
        String[] vegetables = {"Onion", "Carrot", "Beans", "Beetroot"}; // Array
        for (int i = 0; i < vegetables.length; i++) {
            System.out.println("Vegetable: " + vegetables[i]);
        }
        System.out.println(" ");

        // Same for loop to iterate in backwards
        for (int i = vegetables.length - 1; i > 0; i--) {
            System.out.println("Vegetable: " + vegetables[i]);
        }
        System.out.println(" ");

        // Using For each loop
        for (String vegetable : vegetables) {
            System.out.println("Vegetable: " + vegetable);
        }
        // You can only print in forward direction using for-each. not backwards

    }
}
