package com.javaexercises;

import java.util.Scanner;

public class DeveloperTeaTime {

    //    New Function
    public static void announceDeveloperTeaTime() {
        System.out.println("Waiting for developer tea time...");
        System.out.println("Type any word & press Enter to start Developer Tea Time..");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("Its Developer Tea Time!");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to your new job!");
//        Calling the function to main method.
        announceDeveloperTeaTime();
        System.out.println("Write Code");
        System.out.println("Review Code");

        announceDeveloperTeaTime();
        System.out.println("Get promoted!");
    }
}
