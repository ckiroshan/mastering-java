package com.javaexercises;

public class PropertyRentCalculator {
    public static void main(String[] args) {
        double propertyOne = rentPercentage(1300, 250000);
        System.out.println("Property One = " + propertyOne + "%");
    }

    private static double rentPercentage(int monthlyRent, int propertyValue) {
        double annualRent = monthlyRent * 12;
        System.out.println("Annual Rent = $" + annualRent);
        System.out.println("Property Value = $" + propertyValue);
        double rentYield = (annualRent / propertyValue) * 100;
        double roundOffPercentage = Math.round(rentYield * 100) / 100.00;
        return roundOffPercentage;
    }
}

