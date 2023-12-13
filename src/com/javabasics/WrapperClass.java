package com.javabasics;

public class WrapperClass {
    public static void main(String[] args) {
        // Wrapper classes

        // AutoBoxing
        Boolean a = true; // Wraps the boolean primitive type
        Character b = 'K'; // Wraps the char primitive type
        Integer c = 22; // Wraps the int primitive type
        Double d = 64.123; // Wraps the double primitive type
        String e = "Hey!";

        // Unboxing
        if (b == 'K') {
            System.out.println(b);
            System.out.println(b.getClass().getSimpleName());
        }
    }
}
