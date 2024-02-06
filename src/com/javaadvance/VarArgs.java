package com.javaadvance;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // Variable Arguments in Java
        blackArgs(2, 41, 54, 65, 3, 123, 23, 93, 65, 46, 40);
        whiteArgs(99, 201, "Kane", "O", "Mac");
    }

    private static void blackArgs(int... anyName) {
        // int ...anyName => Its taken as an array of integers.
        System.out.println(Arrays.toString(anyName));
    }

    private static void whiteArgs(int a, int b, String... anotherName) {
        // Multiple datatypes can be used as parameters inside one function.
        System.out.println("a = " + a + ", b = " + b);
        System.out.println(Arrays.toString(anotherName));
    }
}
