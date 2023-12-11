package com.javaexercises;

import java.util.Scanner;

public class TriangleCalculator {
    public static void main(String[] args) {
        // Right-angled Triangle hypotenuse Calculator
        // Formula: A*2 + B*2 = C*2

        double sideA;
        double sideB;
        double hypotenuse;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of Side A:");
        sideA = input.nextDouble();
        System.out.println("Enter value of Side B:");
        sideB = input.nextDouble();

        hypotenuse = Math.sqrt(((sideA * sideA) + (sideB * sideB)));
        System.out.println("hypotenuse = " + hypotenuse);
        input.close(); // Will close the scanner

    }
}
