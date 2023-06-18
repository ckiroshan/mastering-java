package com.javaexercises;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        System.out.println("Temperature Converter");
        System.out.println();

//      Declaring value variables.
        int fahrenheit;
        int celsius;
        Scanner input = new Scanner(System.in);

//      Get the user's input.
        System.out.println("Enter temperature in Fahrenheit");
        fahrenheit = input.nextInt();

//      Convert the temperature to Celsius.
        celsius = (fahrenheit - 32) * 5 / 9;

//      Print the converted temperature.
        System.out.println(fahrenheit + "F° in Celsius: " + celsius + "C°");


    }
}
