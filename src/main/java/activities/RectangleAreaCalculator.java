package com.activities;

/*
    Activity 4: Calculate Area of a Rectangle

    Objective:
        Use basic arithmetic operators in Java to calculate the using the formula:
        area = length × width

    Instructions:
        1. Create a Java class named RectangleAreaCalculator.
        2. In the main method:
            * Ask the user to input the area of a rectangle.
            * Use the area formula to compute the result.
            * Display the final area value with proper labels.

    ---------------------------------------------
      Expected Sample Output:
    ---------------------------------------------
    Enter the length: 8
    Enter the width: 4
    The area of the rectangle is: 32.0
*/

import java.util.Scanner;

public class RectangleAreaCalculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the length: ");
        double length = userInput.nextDouble();

        System.out.print("Enter the width: ");
        double width = userInput.nextDouble();

        System.out.println("The area of the rectangle is: " + calculateRectangleArea(length, width));
    }

    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }
}