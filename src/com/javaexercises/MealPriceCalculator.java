package com.javaexercises;

public class MealPriceCalculator {

    public static void calculateTotalMealPrice(double listedMealPrice) {
        double tipRate = .12;
        double taxRate = .10;
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double totalCost = listedMealPrice + tip + tax;
        System.out.println("Meal Price: $" + listedMealPrice);
        System.out.println("Tip: $" + tip);
        System.out.println("Tax: $" + tax);
        System.out.println("Your total price would be: $" + totalCost);
    }

    public static void main(String[] args) {
        System.out.println("This is a Meal price calculator");
        System.out.println(" ");

        calculateTotalMealPrice(22130);

    }
}
