package com.javaadvance;

public class Shadowing {
    // Class Variable
    static int x = 90; // This will be shadowed at line 10.

    public static void main(String[] args) {
        // Shadowing in Java
        System.out.println("x = " + x); // Output: 90
        int x = 40; // The class variable at line 5 is shadowed by this.
        System.out.println("x = " + x); // Output: 40
        fun();
    }

    private static void fun() {
        System.out.println("x = " + x); // Output: 90
    }
}
