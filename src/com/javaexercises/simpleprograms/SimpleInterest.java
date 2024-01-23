package com.javaexercises.simpleprograms;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        // Write a program to input principal, time, and rate (P, T, R)
        // From the user and find Simple Interest.
        /* Example :
         * Loan amount is $18,000. (P)
         * Annual interest rate 6%. (R)
         * The term 3 years. (T)
         * SI = P × R × T
         * $18,000 × 0.06 × 3 = $3,240
         * */

        Scanner input = new Scanner(System.in);
        int p;
        float r;
        int t;
        System.out.print("Loan amount : ");
        p = input.nextInt();
        System.out.print("Annual interest rate : ");
        r = input.nextFloat();
        System.out.print("Repayment term : ");
        t = input.nextInt();

        double simpleInterest = (p * (r / 100) * t);
        System.out.println("Simple Interest: Rs." + simpleInterest);
    }
}
