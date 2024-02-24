package com.javaadvance.algorithms;

public class LinearSearch {
    public static void main(String[] args) {
        // Perform a linear search on given array
        int[] randomArray = {24, 1289, 7618, 90, 152, 781, 98};
        int target = 152;
        int answer = linearSearch(randomArray, target);
        if (answer == -1) {
            System.out.println("Sorry, " + target + " was not found");
        } else {
            System.out.println(target + " found at index:  " + answer);

        }
    }

    public static int linearSearch(int[] arr, int targetElement) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == targetElement) {
                return i;
            }
        }
        return -1;
    }
}
