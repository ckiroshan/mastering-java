package com.javabasics;

public class PrimitiveType {  // Remember: This class name == file name. (if change required, change in both places)
    public static void main(String[] args) {

        byte number = 10;
        short number2 = 150;
        int number3 = 13412350;
        long number4 = 82375172631L; // Make sure to add "L" at value end. important for long.
        float number5 = 34.3F; // Make sure to add "F" at value end. important for float..
        double number6 = 34.224123123123;

        char alphabet = 'a'; // Can only use one character.
        boolean isMale = true;
        System.out.println("The value of Number 1: " + number);
        System.out.println("The value of Number 2: " + number2);
        System.out.println("The value of Number 3: " + number3);
        System.out.println("The value of Number 4: " + number4);
        System.out.println("The value of Alphabet: " + alphabet);
        System.out.println("Is the gender Male: " + isMale);

    }
}
