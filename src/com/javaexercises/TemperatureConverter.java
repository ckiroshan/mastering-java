package com.javaexercises;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        System.out.println("Temperature Converter");
        System.out.println();

//      Declaring value variables.
        double fahrenheit;
        double celsius;
        String InputTemp;
        Scanner input = new Scanner(System.in);

//      Get the user's input.
        System.out.println("Do you want to convert to F° or C°?");
        InputTemp = input.next().toLowerCase();

//      Switch block to check conditions.
        switch (InputTemp) {
            // if user chose "f"
            case "f" -> {
                System.out.println("Enter temperature in Celsius:");
                celsius = input.nextInt();
                // Convert the temperature to Fahrenheit.
                fahrenheit = Math.floor((celsius * 1.8) + 32);
                // Print the converted temperature.
                System.out.println(celsius + "C° in Fahrenheit: " + fahrenheit + "F°");
            }
            //  if user chose "c"
            case "c" -> {
                System.out.println("Enter temperature in Fahrenheit:");
                fahrenheit = input.nextInt();
                // Convert the temperature to Celsius.
                celsius = Math.floor((fahrenheit - 32) * 0.56);
                // Print the converted temperature.
                System.out.println(fahrenheit + "F° in Celsius: " + celsius + "C°");
            }
            default -> System.out.println("Incorrect value, please select C° or F°:");
        }

    }
}
