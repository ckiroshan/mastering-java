package com.javaadvance;

abstract class Car { // Abstract Class
    void run() {
        // Normal method.
        System.out.println("Car will run!");
    }

    abstract void running(); // Declaration
}

class Pulsar extends Car { // Concrete Class
    // Pulsar (Subclass) of Car (Super class)

    @Override
    void running() { // Definition
        System.out.println("Car is running!");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Car object = new Pulsar();
        object.run();
        object.running();
    }
}
