package com.javaexercises;

import java.util.Scanner;

public class RandomNameGenerator {
    public static void main(String[] args) {
        System.out.println("RandomNameGenerator");

        String[] Name = {"Kane", "Blake", "Richard", "Micheal"};
        Scanner input = new Scanner(System.in);

        System.out.println("Here's a random name:");
        System.out.println(Name[0]);
        System.out.println(Name[1]);
        System.out.println(Name[2]);
        System.out.println(Name[3]);
    }
}
