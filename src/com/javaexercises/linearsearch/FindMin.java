package com.javaexercises.linearsearch;

import java.util.Arrays;

public class FindMin {
    public static void main(String[] args) {
        // Find the minimum number in an array.
        int[] newArray = {1123, 242, 6374, 243, 649, 9807, 9898};
        System.out.println("Current Array = " + Arrays.toString(newArray));
        int answer = MinSearch(newArray);
        System.out.print("Min value :" + answer);
    }

    static int MinSearch(int[] arr) {
        int min = arr[0];

        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
