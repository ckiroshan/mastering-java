package com.javaexercises.simpleprograms;

import java.util.Scanner;

public class GreetingApp {
    public static void main(String[] args) {
        // Take name as input and print a greeting message for that particular name.

        Scanner input = new Scanner(System.in);
        String name;
        System.out.print("What is your name? : ");
        name = input.nextLine();
        System.out.println("Hey " + name + ", Welcome Home!");
    }
}
