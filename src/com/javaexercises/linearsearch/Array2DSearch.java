package com.javaexercises.linearsearch;

import java.util.Arrays;

public class Array2DSearch {
    public static void main(String[] args) {
        // Search in a 2D array

        int[][] array = {
                {23, 41, 56},
                {29, 89, 99},
                {74, 12, 44},
                {55, 81, 62}
        };

        int target = 12;
        System.out.println("array = " + Arrays.deepToString(array));
        System.out.println("Search for: " + target);
        int answer = linearSearch(array, target);

        if (answer <= 0) {
            System.out.println("Value Not found :(");
        } else {
            System.out.println(answer + " has been found ;)");
        }
    }

    static int linearSearch(int[][] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int[] row : arr) {
            for (int column : row) {
                if (column == target) {
                    return target;
                }
            }
        }
        return -1;
    }
}
