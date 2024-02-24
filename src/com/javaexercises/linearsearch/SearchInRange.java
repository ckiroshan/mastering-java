package com.javaexercises.linearsearch;

import java.util.Arrays;

public class SearchInRange {
    public static void main(String[] args) {
        // Search a value within given range of an Array
        int start = 2;
        int end = 4;
        int[] newArray = {1123, 242, 6374, 3, 649, 9807, 9898};
        System.out.println("Current Array : " + Arrays.toString(newArray));
        System.out.println("Range from :" + newArray[start] + " - " + newArray[end]);

        System.out.println(linearSearch(newArray, 30, 1, 4));
    }

    public static int linearSearch(int[] arr, int targetElement, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = start; i < end; i++) {
            if (arr[i] == targetElement) {
                return i;
            }
        }
        return -1;
    }
}
