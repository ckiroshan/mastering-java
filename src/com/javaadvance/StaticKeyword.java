package com.javaadvance;

public class StaticKeyword {
    public static void main(String[] args) {
        System.out.println("Hey there!");
        System.out.println(" ");

        Student kane = new Student();
        kane.indexNumber = 21312;
        kane.studentGrade = 10;

        System.out.println("The Index Number of Kane: " + kane.indexNumber);
        System.out.println("The Grade of Kane: " + kane.studentGrade);
        System.out.println("The Principal of the school: " + Student.principalName);
    }
}

class Student {
    int indexNumber;
    int studentGrade;
    static String principalName;
//    This value remains fixed once a value is assigned.

    static {
//      Any value assigned inside this block will remain fixed and won't change.
        principalName = "Vince";
//      Make sure the static keyword is used when declaring the variable.
//      To assign values in this block.
    }

}
