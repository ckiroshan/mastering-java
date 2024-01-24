package com.javaexercises.simpleprograms;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        // Input currency in rupees and output in USD.

        Scanner input = new Scanner(System.in);
        float inRupees;
        float inUSDollars;

        System.out.print("Enter currency in Rupees(LKR) : ");
        inRupees = input.nextFloat();

        inUSDollars = (inRupees / 362.5f);
        inUSDollars = Float.parseFloat(String.format("%.2f", inUSDollars));
        System.out.println("$" + inUSDollars);
    }

}
