package com.javaadvance;

class FirstDummy { // Super Class
    void display() {
        // A method in the base class to display a message.
        System.out.println("This is First Dummy!");
    }
}

class SecondDummy extends FirstDummy { // Sub Class : extends 'FirstDummy' class (it inherits from it).
    @Override
    void display() { // This method overrides the 'display' method in the base class.
        System.out.println("This is Second Dummy!");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        // Creating an instance of 'SecondDummy'
        SecondDummy dummy2 = new SecondDummy();
        // Calling the overridden 'display' method on the 'dummy2' instance.
        dummy2.display();
    }
}
