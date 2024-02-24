package com.javaexercises.linearsearch;

import java.util.Arrays;

public class FindMax {
    public static void main(String[] args) {
        // Find the maximum number in an array.
        int[] newArray = {1123, 242, 63074, 243, 649, 9807, 9898};
        System.out.println("Current Array = " + Arrays.toString(newArray));
        int answer = MaxSearch(newArray);
        System.out.print("Max value :" + answer);
    }

    static int MaxSearch(int[] arr) {
        int max = arr[0];

        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
