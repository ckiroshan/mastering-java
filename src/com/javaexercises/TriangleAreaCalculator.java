package com.javaexercises;

class Triangle {
    //    Defining the variables
//    Static variables - these don't change or mutate.
    static int numberOfSides = 3;

    //    Non-static variables - these values change based on Arguments passed.
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

    //    Initializing Triangle constructor
    public Triangle(double base,
                    double height,
                    double sideLenOne,
                    double sideLenTwo,
                    double sideLenThree) {
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }

    public double findArea() {
        return (this.base * this.height) / 2;
    }
}

public class TriangleAreaCalculator {
    public static void main(String[] args) {

        Triangle firstTriangle = new Triangle(15, 8, 15, 8, 17);
        System.out.println("Area of first triangle: " + firstTriangle.findArea());
        Triangle secondTriangle = new Triangle(3, 2.598, 3, 3, 3);
        System.out.println("Area of second triangle: " + secondTriangle.findArea());
        System.out.println("Number of sides in a triangle: " + Triangle.numberOfSides);
    }
}
