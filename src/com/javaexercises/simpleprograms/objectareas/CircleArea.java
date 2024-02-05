package com.javaexercises.simpleprograms.objectareas;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        // Area Of Circle Java Program

        Scanner input = new Scanner(System.in);

        double pi = 3.14159265;
        System.out.print("Enter radius value: ");
        double radius = input.nextDouble();
        System.out.println("π: " + pi);
        System.out.println("Radius: " + radius + "cm");

        double answer = areaCalculator(pi, radius);
        System.out.println("Area: " + answer + "cm2");

    }

    public static double areaCalculator(double pi, double radius) {
        // Formula: A=πr2
        double area = pi * (radius * radius);
        return Math.round(area * 100.0) / 100.0;
    }
}
