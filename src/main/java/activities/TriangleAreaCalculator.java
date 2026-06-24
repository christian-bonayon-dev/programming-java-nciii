package com.activities;

/*
    Activity 6: Calculate Area of a Triangle

    Objective:
        Use arithmetic operators to calculate the area of a triangle using the formula:
        Area = (1/2) × base × height

    Instructions:
        1. Create a Java class named TriangleAreaCalculator.
        2. In the main method:
            * Ask the user to enter the base and height  of a triangle.
            * Use the formula to compute the area.
            * Print the area with a label and proper formatting.

    ---------------------------------------------
      Expected Sample Output
    ---------------------------------------------
    Enter the base: 10
    Enter the height: 5
    The area of the triangle is: 25.0
*/

import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the base: ");
        double base = userInput.nextDouble();

        System.out.print("Enter the height: ");
        double height = userInput.nextDouble();

        System.out.println("The area of the triangle is: " + calculateTriangleArea(base, height));
    }

    public static double calculateTriangleArea(double base, double height) {
        return (base * height) * 1 / 2;
    }
}
