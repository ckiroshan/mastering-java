package com.javabasics;

import java.lang.Math;

public class MathClass {
    public static void main(String[] args) {
//        Math Object in Java
        int number = 231;
        float number2 = 31.22f;

        System.out.println(Math.abs(number2)); // Output: 31.22
        System.out.println(Math.ceil(number2)); // Output: 32.0 => Round off to next whole number
        System.out.println(Math.floor(number2)); // Output: 31.0 => Round off to previous whole number
        System.out.println(Math.max(number, number2)); // Output: 231.0 => Find max out of 2 variables
        System.out.println(Math.min(number, number2)); // Output: 31.22 => Find min out of 2 variables
        System.out.println(Math.exp(number2));
        System.out.println(Math.log(number)); // Output: 5.442 => Find log of 231.
    }
}
