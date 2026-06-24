package activities;

/*
    Activity 5: Calculate Area of a Circle

    Objective:
        Apply the formula for the :
        Area = π x r^2
        Where is the radius of the circle.

    Instructions:
        1. Create a Java class named CircleAreaCalculator.
        2. In your main method:
            * Ask the user to input the of the circle.
            * Use the formula πr2 to calculate the area.
            * You can use Math.PI for the value of π in Java.

    Display the result, rounded to .

    ---------------------------------------------
      Expected Sample Output:
    ---------------------------------------------
    Enter the radius of the circle: 5
    The area of the circle is: 78.54
*/

import java.util.Scanner;

public class CircleAreaCalculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        final double PI = Math.PI;

        System.out.print("Enter the radius of the circle: ");
        double radius = userInput.nextDouble();

        System.out.printf("The area of the circle is: %.2f", calculateCircleArea(PI, radius));
    }

    public static double calculateCircleArea(double PI, double radius) {
        return (PI * radius) * radius;
    }
}