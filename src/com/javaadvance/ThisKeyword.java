package com.javaadvance;

public class ThisKeyword {
    public static void main(String[] args) {
        System.out.println("Hi there!");

//        Creating the object
        AnotherClass anotherObject = new AnotherClass(10);
        System.out.println(anotherObject.number1);
    }

}

class AnotherClass {
    int number1;

    AnotherClass(int number1) {
//      It's recommended to use same variable name used outside scope when setting values in constructor.
//      "this" can be used to point that "number1" here refers to int number1 outside scope.
        this.number1 = number1;
    }

}
