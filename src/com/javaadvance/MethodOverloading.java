package com.javaadvance;

public class MethodOverloading {

    public static void main(String[] args) {
        System.out.println("Hello there!");
        System.out.println(" ");

        add(9);
        add(20, 10);
        add(30, 20, 10);
    }

    private static void add(int number1) {
        System.out.println(number1 + " + " + number1 + " = " + (number1 + number1));
    }

    private static void add(int number1, int number2) {
        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
    }

    private static void add(int number1, int number2, int number3) {
        System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + (number1 + number2 + number3));
    }
}
