package com.javaadvance;

class Template1 {
    final void display() {
        int i = 100;
        System.out.println(i);
    }
}

class Template2 extends Template1 {
    /*
    @Override
    void display() {
        // Can't override methods when final is used.
    }
    */
}

public class FinalKeyword {
    public static void main(String[] args) {
        Template2 newObject = new Template2();
        newObject.display();
    }
}
