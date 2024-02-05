package com.javaexercises.simpleprograms.objectareas;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        // Area Of Rectangle Program

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Length (cm): ");
        double length = input.nextDouble();
        System.out.print("Enter Width (cm): ");
        double width = input.nextDouble();
        System.out.println("Length: " + length + "cm");
        System.out.println("Width: " + width + "cm");

        double answer = areaCalculator(length, width);
        System.out.println("Area: " + answer + "cm2");

    }

    public static double areaCalculator(double length, double width) {
        // Formula: A = length x width
        double area = length * width;
        return Math.round(area * 100.0) / 100.0;
    }
}
