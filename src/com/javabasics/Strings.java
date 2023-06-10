package com.javabasics;

public class Strings {
    public static void main(String[] args) {
//        Strings => Reference Type
        String channelName = "BruH!";
        System.out.println(channelName); // Output: BruH!
        System.out.println(channelName.length()); // Output: 5
        System.out.println(channelName.toUpperCase()); // Output: BRUH!
        System.out.println(channelName.toLowerCase()); // Output: bruh!

        String newStringValue = "    Hey Bro!";
        System.out.println(newStringValue); // Output:     Hey Bro!
        System.out.println(newStringValue.trim()); // Output: Hey Bro! => removes spaces

//        The following are boolean results
        System.out.println(newStringValue.startsWith("H")); // Output: false => Starting letter is empty space
        System.out.println(newStringValue.startsWith(" ")); // Output: true => Starting letter is empty space
        System.out.println(newStringValue.endsWith("!")); // Output: true => Ends with '!'

//        Constants in JAVA.
        final int constNumber = 431231; // 'final' => keyword used to declare constants.
        System.out.println(constNumber); // Output: 431231
//        These values cannot be changed once declared.
//        If tried, would cause an error.


    }
}
