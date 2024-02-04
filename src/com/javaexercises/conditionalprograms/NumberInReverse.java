package com.javaexercises.conditionalprograms;

import java.util.Scanner;

public class NumberInReverse {
    public static void main(String[] args) {
        // Given a number, print the reverse of it.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt(); // 766271 = 172667

        int tempNumber = number;
        int answer = 0;
        while (tempNumber > 0) {
            int remainder = tempNumber % 10;
            tempNumber = tempNumber / 10;
            answer = answer * 10 + remainder;

        }
        System.out.println("number in reverse : " + answer);
    }
}
