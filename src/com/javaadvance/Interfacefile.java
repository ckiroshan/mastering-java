package com.javaadvance;

interface newInterface {
    void methodOne();
}

interface newInterface2 {
    int methodTwo(int i);
}

class Destiny implements newInterface, newInterface2 { // This is multiple inheritance
    // This will implement the interfaces: newInterface & newInterface2
    public void methodOne() {
        System.out.println("This is method One!");
    }

    public int methodTwo(int i) {
        return i;
    }
}

public class Interfacefile {
    public static void main(String[] args) {
        Destiny newObject = new Destiny();
        Destiny newObject2 = new Destiny();

        newObject.methodOne();
        System.out.println("value passed: " + newObject2.methodTwo(10));
    }
}
