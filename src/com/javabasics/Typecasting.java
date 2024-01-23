package com.javabasics;

public class Typecasting {
    public static void main(String[] args) {
        int number = (int) (131.69f);
        System.out.println(number); // Output: 131

        int number2 = (int) (132.01f);
        System.out.println(number2); // Output: 132

        // Automatic type promotion in expressions
        int a = 257;
        byte b = (byte) (a); // 257 % 256 = 1
        System.out.println(b); // Output: 1

        // Another case :
        byte abc = 40;
        byte def = 50;
        byte ghi = 100;
        int total = (abc * def) / ghi;

        System.out.println(total); // Output: (40 * 50) / 100 => 20

        // Char to Int
        int anotherNumber = 'A';
        int anotherNumber2 = 'b';

        System.out.println(anotherNumber); // Output: 65
        System.out.println(anotherNumber2); // Output: 98

    }
}
