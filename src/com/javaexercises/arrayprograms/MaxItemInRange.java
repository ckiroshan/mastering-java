package com.javaexercises.arrayprograms;

import java.util.Arrays;

public class MaxItemInRange {
    public static void main(String[] args) {
        // Find the maximum item in a given range of an array.
        /*
         * initial max = start_range
         * i = start_range; loop through array end_range
         *  if [i] > max
         *      max = [i]
         * return max */

        int start = 2;
        int end = 4;
        int[] newArray = {1123, 242, 6374, 9415, 649, 9807, 9898};
        System.out.println("Current Array : " + Arrays.toString(newArray));
        System.out.println("Range from :" + newArray[start] + " - " + newArray[end]);
        System.out.print("Max value : ");
        System.out.println(maxInRange(newArray, 2, 4)); // Output: [1, 2, 4, 5, 6, 7, 8]
    }

    static int maxInRange(int[] arr, int start, int end) {
        if (arr.length == 0) {
            // If Array was empty
            return -1;
        }
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
