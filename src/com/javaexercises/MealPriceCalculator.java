package com.javaexercises;

public class MealPriceCalculator {

    public static double calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        System.out.println("Meal price Rs:" + listedMealPrice);
        System.out.println("Tip: Rs" + tip);
        System.out.println("Tax: Rs" + tax);
        return listedMealPrice + tip + tax;
    }

    public static void main(String[] args) {
        System.out.println("This is a Meal price calculator");
        System.out.println(" ");

        double groupTotalMealPrice = calculateTotalMealPrice(700, .2, .08);
        System.out.println("Total Meal price: Rs" + groupTotalMealPrice);

        int eaters = 5;
        System.out.println("Number of people in group: " + eaters);
        double individualMealPrice = groupTotalMealPrice / eaters;
        System.out.println("Per person cost: Rs" + individualMealPrice);

    }
}
