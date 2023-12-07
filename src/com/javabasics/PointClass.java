package com.javabasics;

import java.awt.*;

public class PointClass {
    public static void main(String[] args) {
        // Point Class in action
        int age = 23;
        Point pointA = new Point(20, 30); // An instance of Point class
        System.out.println("pointA = " + pointA);
        pointA.move(25, 40); // Move the coordinates of 'pointA' to (25, 40)
        System.out.println("pointA = " + pointA); // Updated coordinates of 'pointA'

    }

}
