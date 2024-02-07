package com.javaexercises.simpleprograms.objectareas;

import java.util.Scanner;

public class IsoscelesTriangleArea {
    public static void main(String[] args) {
        // Area Of Triangle
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Base (cm): ");
        double base = input.nextDouble();
        System.out.print("Enter Height (cm): ");
        double height = input.nextDouble();
        System.out.println("Base: " + base + "cm");
        System.out.println("Height: " + height + "cm");

        double answer = areaCalculator(base, height);
        System.out.println("Area: " + answer + "cm2");

    }

    public static double areaCalculator(double base, double height) {
        // Formula: A = 1/2 × b × h
        double area = (double) 1 / 2 * base * height;
        return Math.round(area * 100.0) / 100.0;
    }
}
