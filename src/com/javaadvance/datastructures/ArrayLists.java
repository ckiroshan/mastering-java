package com.javaadvance.datastructures;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        // Array lists in Java
        Scanner input = new Scanner(System.in);

        // Syntax
        ArrayList<Integer> list = new ArrayList<>(5);

        list.add(21);
        list.add(31);
        list.add(41);
        list.add(51);
        list.add(61);
        list.add(71);
        list.add(81);

        System.out.println("list = " + list);
        System.out.println(list.contains(81));
        list.set(0, 11);
        System.out.println("list = " + list);
        list.remove(3);
        System.out.println("list = " + list);
        System.out.println();

        // String list
        ArrayList<String> stringList = new ArrayList<>(3);
        System.out.print("Enter 3 words for the list: ");

        // Add user input to the list
        for (int i = 0; i < 3; i++) {
            stringList.add(input.next());
        }
        System.out.println("stringList = " + stringList);

        // Get item at each index
        for (int i = 0; i < 3; i++) {
            System.out.print(stringList.get(i) + " ");
        }

    }
}
