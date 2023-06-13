package com.javaadvance;

class Add { //    This is Super class. (parent class)
    Add() {
//        Default constructor
    }

    Add(int number1, int number2) {
        System.out.println(number1 + number2);
    }

    void run() {
        System.out.println("This is from Add class!");
    }
}

class Subtract extends Add {//    This is Sub class. (child class)

    //    "extends" keyword is used to inherit fields, constructors, methods from "Add" class.
//    This is single level inheritance.
    void run2() {
        System.out.println("This is from Subtract class!");
    }
}

class Multiply extends Subtract {
//    This is Sub class. (child class of Subtract super class)
//    This extends from "Subtract" class.
//    So it has access to fields, constructors, methods from both Add & Subtract class.
//    This is multiple inheritance.
}

class Division extends Add {
//    This is Sub class. (child class of Add super class)
//    This is called Hierarchical inheritance.
}

public class InheritanceOOP {
    public static void main(String[] args) {

//        Usual way of using a class as an object.
//        add additionObject = new add(10, 21);
        Multiply mulObject = new Multiply();
        mulObject.run();
        mulObject.run2();
        Division divideObject = new Division();
        divideObject.run();

    }
}
