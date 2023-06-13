package com.javaadvance;

public class ConstructorFunction {
    public static void main(String[] args) {

//        Dog class
//        Labrador Dog
        Dog labrador = new Dog();
        labrador.dogAge = 1;
        labrador.dogColor = "Gold";
        labrador.dogSize = 4;
        System.out.println("You have chosen a Labrador with following specifications");
        System.out.println("Labrador's age: " + labrador.dogAge);
        System.out.println("Labrador's color: " + labrador.dogColor);
        System.out.println("Labrador's size: " + labrador.dogSize);
        labrador.eat();

        System.out.println(" ");

//        German Shepard Dog
        Dog germanShepard = new Dog();
        germanShepard.dogAge = 2;
        germanShepard.dogColor = "Black";
        System.out.println("You have chosen a German Shepard with following specifications");
        System.out.println("German Shepard's age: " + germanShepard.dogAge);
        System.out.println("German Shepard's color: " + germanShepard.dogColor);
        System.out.println("German Shepard's size: " + germanShepard.dogSize); // Output: 1
        germanShepard.eat();
        System.out.println(" ");

//        In the above, Dog size wasn't given, but by default it printed as 1.
//        This happens because of the constructor.


//        An enhanced way of using "Parameterized Constructor".
        Dog dalmatian = new Dog(3, "White", 3); // All values can be declared in single line.
        System.out.println("You have chosen a Dalmatian with following specifications");
        System.out.println("Dalmatian's age: " + dalmatian.dogAge);
        System.out.println("Dalmatian's color: " + dalmatian.dogColor);
        System.out.println("Dalmatian's size: " + dalmatian.dogSize);
        dalmatian.eat();
        System.out.println(" ");

//        Another example
        Dog bulldog = new Dog("Brown");
        System.out.println("You have chosen a Bulldog with following specifications");
        System.out.println("Bulldog's age: " + bulldog.dogAge);
        System.out.println("Bulldog's color: " + bulldog.dogColor);
        System.out.println("Bulldog's size: " + bulldog.dogSize);
        bulldog.eat();
        System.out.println(" ");
    }
}

class Dog {

    //  Data members (fields)
    int dogAge;
    String dogColor;
    int dogSize;

    Dog() {
//        Default Constructor
        dogAge = 2;
        dogColor = "Black";
        dogSize = 1;
        System.out.println("Default constructor is running!");
    }

    Dog(String c) {
        dogColor = c;
        System.out.println("c color constructor is running!");
    }

    Dog(int a, String c, int s) {
//        Parameterized Constructor
        dogAge = a;
        dogColor = c;
        dogSize = s;
        System.out.println("a c s Constructor is running!");
    }

    //  Methods
    void eat() {
        System.out.println("The dog is eating now!");
    }
    
}