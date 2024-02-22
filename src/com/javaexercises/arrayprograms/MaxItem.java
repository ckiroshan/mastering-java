package com.javaexercises.arrayprograms;

import java.util.Arrays;

public class MaxItem {
    public static void main(String[] args) {
        // Find the maximum item in an array.
        /*
         * initial max = 0
         * loop through array length
         *  if [i] > max
         *      max = [i]
         * return max */

        int[] newArray = {1123, 242, 6374, 9415, 649, 9807, 9898};
        System.out.println("Current Array : " + Arrays.toString(newArray));
        System.out.print("Max value : ");
        System.out.println(max(newArray)); // Output: [1, 2, 4, 5, 6, 7, 8]

    }

    static int max(int[] arr) {
        if (arr.length == 0) {
            // If Array was empty
            return -1;
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
