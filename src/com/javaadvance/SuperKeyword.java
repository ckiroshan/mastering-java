package com.javaadvance;

class Dummy1 {
    //    Just a class
    Dummy1() {
//        Default constructor
        System.out.println("Dummy 01");
    }

    Dummy1(int i) {
        System.out.println("Hi Dummy01!");
    }
}

class Dummy2 extends Dummy1 {
    //    this inherits dummy1
    Dummy2() {
//        Default constructor
        System.out.println("Dummy 02");
    }

    Dummy2(int i) {
        super(i); // Checks Dummy1 for parameter with "i"
//        Once found, it would execute that constructor.
//        Else default constructor is used.
        System.out.println("Hi Dummy02!");
    }

}

public class SuperKeyword {
    public static void main(String[] args) {
        System.out.println("This is Super Keyword!");

        Dummy2 dummyObject = new Dummy2(10);
    }
}
