package com.javaexercises.arrayprograms;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        // Reversing an array

        int[] newArray = {1123, 242, 6374, 1, 9415, 649, 9807, 9898};
        System.out.println("Original Array : " + Arrays.toString(newArray));
        reverse(newArray); // Output: [1, 2, 4, 5, 6, 7, 8]
        System.out.print("Reverse Array : " + Arrays.toString(newArray));
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
