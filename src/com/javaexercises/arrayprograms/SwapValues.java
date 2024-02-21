package com.javaexercises.arrayprograms;

import java.util.Arrays;

public class SwapValues {
    public static void main(String[] args) {
        // A method that swaps 2 values in an array.

        int[] newArray = {1, 2, 4, 5, 6, 7, 8};
        System.out.println("new Array = " + Arrays.toString(newArray)); // Output: [1, 2, 4, 5, 6, 7, 8]
        swap(newArray, 0, 2); // Will swap index 0 with 2. (Values 4 with 1)
        System.out.println("Swapped Array = " + Arrays.toString(newArray)); // Output: [4, 2, 1, 5, 6, 7, 8]
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
