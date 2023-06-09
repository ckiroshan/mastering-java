package com.javabasics;

import java.util.Arrays;

public class ArraysType {
    public static void main(String[] args) {
//        Array - Reference Type
        int[] numbers = new int[5];
/*        int    => datatype
          '[]'   => array is being created.
          'new'  => must use on reference types. its keyword
          int[5] => array size
          reference types once declared becomes objects. so we can call methods on them.
*/
        numbers[0] = 153;
        numbers[1] = 12;
        numbers[2] = 13;
        numbers[3] = 14;
        numbers[4] = 15;
        String result = Arrays.toString(numbers);
        System.out.println(result);
        System.out.println(Arrays.toString(numbers)); // Array becomes string and then printed: [153, 12, 13, 14, 15]
        System.out.println(Arrays.toString(numbers).getClass().getSimpleName()); // Get type of variable: String
        System.out.println("Number at Index 0: " + numbers[0]); // to print a specific index: Number at Index 0: 153
        System.out.println("Number at Index 1: " + numbers[1]);
        System.out.println("Number at Index 2: " + numbers[2]);

//        Array creation #2
        int[] newNumbers = new int[]{21, 53, 52, 93, 531};
        System.out.println(Arrays.toString(newNumbers)); // Print: [21, 53, 52, 93, 531]

//        Array creation #3
        char chars[] = {'s', '2', '1', '9'}; // Introduced newly
        System.out.println(Arrays.toString(chars)); // Print: [s, 2, 1, 9]
        System.out.println(chars[2]); // Print: 1

        int charLength = chars.length; // Assigns 'chars' total length to 'charLength'
        System.out.println(charLength); // Print: 4

        char[] newChars = chars.clone(); // Will clone 'chars' array to 'newChars' array
        System.out.println(Arrays.toString(newChars));

//        Multi-dimensional Arrays
        int[][] newArray = {{123, 31}, {2, 412}};
        int[][][] newArray2 = {{{123, 31}}, {{2, 412}}};

        System.out.println(Arrays.deepToString(newArray));
        System.out.println(Arrays.deepToString(newArray2));

    }
}
