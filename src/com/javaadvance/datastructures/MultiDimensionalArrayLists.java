package com.javaadvance.datastructures;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArrayLists {
    public static void main(String[] args) {
        // Multi - Dimensional Array Lists
        Scanner input = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> proList = new ArrayList<>();

        // Array Initialization
        for (int i = 0; i < 3; i++) {
            proList.add(new ArrayList<>());
        }

        // Add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                proList.get(i).add(input.nextInt());
            }
        }
        System.out.println("proList = " + proList);
    }
}
