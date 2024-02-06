package com.javaadvance;

public class Scoping {
    public static void main(String[] args) {
        // Scope explained in Java

        int a = 10;
        int b = 20;

        // block scope
        {
            a = 100; // Can't initialize if already initialized.
            System.out.println("a = " + a);
            int c = 99; // Can initialize a new one.
            System.out.println("c = " + c);
        }
        System.out.println("a = " + a);
        int c = 1; // Can initialize again, since that c is only inside block scope.
        System.out.println("c = " + c);
    }
}
