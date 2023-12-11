package com.javabasics;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        // Random class in Java

        Random randomValue = new Random();
        int numberOne = randomValue.nextInt(6) + 1;
        double numberTwo = randomValue.nextDouble();
        boolean booleanOne = randomValue.nextBoolean();

        System.out.println("numberOne = " + numberOne);
        System.out.println("numberTwo = " + numberTwo);
        System.out.println("booleanOne = " + booleanOne);
    }
}
