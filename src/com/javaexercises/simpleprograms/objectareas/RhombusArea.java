package com.javaexercises.simpleprograms.objectareas;

import java.util.Scanner;

public class RhombusArea {
    public static void main(String[] args) {
        // Area of Rhombus = ( d1 * d2 ) / 2

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st diagonal (cm): ");
        double diagonal1 = input.nextDouble();
        System.out.print("Enter 2nd diagonal (cm): ");
        double diagonal2 = input.nextDouble();
        System.out.println("Length: " + diagonal1 + "cm");
        System.out.println("Width: " + diagonal2 + "cm");

        double answer = areaCalculator(diagonal1, diagonal2);
        System.out.println("Area: " + answer + "cm2");

    }

    public static double areaCalculator(double diagonal1, double diagonal2) {
        // Formula: A = ( d1 * d2 ) / 2
        double area = (diagonal1 * diagonal2) / 2;
        return Math.round(area * 100.0) / 100.0;
    }

}

