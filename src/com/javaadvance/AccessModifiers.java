package com.javaadvance;

public class AccessModifiers {
    public static void main(String[] args) {
        // Default method - Compiler only runs main method in a class.
        System.out.println("Hello World!");
        methodOne(); // Calling methodOne
        System.out.println("MethodTwo returns: " + methodTwo()); // to print the returned values
        System.out.println("MethodThree returns: " + methodThree(10, 23, 60));
//        When use pass ARGs to methodThree. You can only pass whole numbers.

        System.out.println("methodFour returns: " + methodFour(10));
//        When use pass ARGs to methodFour. You can use decimals & whole numbers.
        System.out.println(" ");


//      TestBob is a class. an object is created below to use it in main method.
        TestBob newObject = new TestBob();
//      useMe() method is called on newObject. method stored in TestBob class.
        newObject.useMe();

//      Example 02
        int value = newObject.subtractNumbers(20, 10);
        System.out.println(value);
        System.out.println(newObject.subtractNumbers(2312, 342));
    }

    //    Creating custom methods
    // (modifier type, return type, method name
    public static void methodOne() {
        System.out.println("Method One");
        // If modifier is not mentioned. Compiler takes it as public by default.
        // Eg: static void methodOne() === public static void methodOne()
        // 'void' => keyword. when used, it won't return anything.
    }

    private static int methodTwo() {
        return (10 + 20);
        // This would also work on main method.
        // All public & private methods can be accessed within a Class.
        // Private won't work outside this class.
    }

    private static int methodThree(int num1, int num2, int num3) {
        return (num1 * num2) - num3;
//        When void is not used. The method has to return something.
    }

    private static double methodFour(double num1) {
        return num1 * num1;
    }

}

class TestBob {
    void useMe() {
        System.out.println("This is the useMe method from TestClass");
    }

    public int subtractNumbers(int number1, int number2) {
        return number1 - number2;
    }
}