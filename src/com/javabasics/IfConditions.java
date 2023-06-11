package com.javabasics;

import java.util.Scanner;

@SuppressWarnings({"ConstantConditions", "RedundantSuppression"})

public class IfConditions {
    public static void main(String[] args) {
//        If Conditions

//        Video Example
        /*
        int cashInHand;
        int pen = 40;
        int specialPen = 60;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter you cash in hand: ");
        cashInHand = input.nextInt();

        if (cashInHand >= specialPen) {
            System.out.println("You can buy the special pen.");
        } else if (cashInHand >= pen) {
            System.out.println("You can buy the normal pen.");
        } else {
            System.out.println("Sorry, You can't afford both the pens.");
        }

         */

//        My Example
        int pen = 80;
        int cashInHand;

        Scanner input = new Scanner(System.in);
        System.out.println("The cost of Pen is: $" + pen);
        System.out.println("How much do you have?");
        cashInHand = input.nextInt();

        if (cashInHand == pen) {
            System.out.println("Here's your pen!");
        } else if (cashInHand > pen) {
            System.out.println("Here's your pen! You're balance amount is: $" + (cashInHand - pen) + "!");
        } else {
            System.out.println("Sorry, you still need $" + (pen - cashInHand) + " more!");
        }
    }
}
