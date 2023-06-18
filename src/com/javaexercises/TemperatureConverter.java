package com.javaexercises;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        System.out.println("Temperature Converter");
        System.out.println();

//      Declaring value variables.
        int fahrenheit;
        int celsius;
        String InputTemp;
        Scanner input = new Scanner(System.in);

//      Get the user's input.
        System.out.println("Do you want to convert to F° or C°?");
        InputTemp = input.next().toLowerCase();
        if (InputTemp.equals("f")) {
            System.out.println("Enter temperature in Celsius:");
            fahrenheit = input.nextInt();
            celsius = (fahrenheit * 9 / 5) + 32;
            System.out.println(fahrenheit + "C° in Fahrenheit: " + celsius + "F°");
        } else {
            System.out.println("Enter temperature in Fahrenheit:");
            celsius = input.nextInt();
            fahrenheit = (celsius - 32) * 5 / 9;
//            °F = (°C × 9/5) + 32
            System.out.println(celsius + "F° in Celsius: " + fahrenheit + "C°");
        }

//      Convert the temperature to Celsius.


//      Print the converted temperature.


    }
}
