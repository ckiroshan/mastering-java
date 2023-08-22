package com.javaadvance;

class AdamClass {
    void adamMethod() {
        System.out.println("This is Adam method!");
    }

    class BadamClass { // Inner class
        void badamMethod() {
            System.out.println("This is Badam method!");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        AdamClass adamObject = new AdamClass();
        adamObject.adamMethod();
        AdamClass.BadamClass badamObject = adamObject.new BadamClass();
        // parent-class.inner-class | object name = parent-object.new inner-class();
        badamObject.badamMethod();
    }
}
