package com.javaexercises.linearsearch;

import java.util.Arrays;

public class MaxMin2DArray {
    public static void main(String[] args) {
        // Find the maximum number in an array.
        int[][] array = {
                {23, 41, 56},
                {29, 89, 99},
                {74, 12, 44},
                {55, 81, 62}
        };
        System.out.println("Current Array = " + Arrays.deepToString(array));
        int maxAnswer = MaxSearch(array);
        System.out.println("Max value :" + maxAnswer);
        int minAnswer = MinSearch(array);
        System.out.println("Min value :" + minAnswer);
    }

    static int MaxSearch(int[][] arr) {
        int max = Integer.MIN_VALUE;

        if (arr.length == 0) {
            return -1;
        }

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] > max) {
                    max = arr[row][column];
                }
            }
        }
        return max;
    }

    static int MinSearch(int[][] arr) {
        int min = Integer.MAX_VALUE;

        if (arr.length == 0) {
            return -1;
        }

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] < min) {
                    min = arr[row][column];
                }
            }
        }
        return min;
    }

}
