package com.javaleetcode;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class EvenDigits1295 {
    public static void main(String[] args) {
        // Given an array numbers of integers.
        // Return how many of them contain an even number of digits.
        int[] testArray = {12, 345, 2, 6, 7896};
        int[] testArray2 = {555, 901, 482, 1771};
        System.out.println(findNumbers(testArray));
        System.out.println(findNumbers(testArray2));
        System.out.println(digits(0));

    }

    // Count of all even numbers
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // Check if number contains even digits
    static boolean even(int num) {
        return digits(num) % 2 == 0;
    }

    static int digits(int num) {
        // Account for negative numbers
        if (num < 0) {
            num = num * -1;
        }

        // Check for 0 digits
        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;

        }
        return count;
    }
}
