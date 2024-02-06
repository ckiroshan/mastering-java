package com.javaexercises.simpleprograms.objectareas;

import java.util.Scanner;

public class EquilateralTriangleArea {
    public static void main(String[] args) {
        // Area of Equilateral Triangle

        Scanner input = new Scanner(System.in);

        System.out.print("Enter value for 'a' (cm): ");
        double sideA = input.nextDouble();
        System.out.println("Length: " + sideA + "cm");

        double answer = areaCalculator(sideA);
        System.out.println("Area: " + answer + "cm2");

    }

    public static double areaCalculator(double sideA) {
        // Formula: A = ( 1.73 × a × a)/4
        double area = (1.73 * sideA * sideA) / 4;
        return Math.round(area * 100.0) / 100.0;
    }
}
