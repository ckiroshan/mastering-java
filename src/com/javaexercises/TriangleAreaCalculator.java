package com.javaexercises;

class Triangle {
    //    Defining the variables
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
    }
}
