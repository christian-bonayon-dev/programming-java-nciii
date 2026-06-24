package activities;

/*
    Activity 12: Find the Largest Among Three Numbers

    Objective:
        Use if-else statements and logical comparisons to determine the among three user inputs.

    Instructions:
        1. Create a Java class named LargestNumberFinder.
        2. In the main method:
            * Ask the user to input .
            * Use conditional statements (if, else if, else) to compare the numbers.
            * Print which number is the .
            * Handle cases where two or all numbers are equal.

    -------------------------------------------------------
      Expected Sample Output
    -------------------------------------------------------
    Enter first number: 45
    Enter second number: 72
    Enter third number: 13

    The largest number is: 72

    ----------------
    Enter first number: 9
    Enter second number: 9
    Enter third number: 9

    All numbers are equal.
*/

import java.util.Scanner;

public class LargestNumberFinder {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNumber = userInput.nextDouble();

        System.out.print("Enter second number: ");
        double secondNumber = userInput.nextDouble();

        System.out.print("Enter third number: ");
        double thirdNumber = userInput.nextDouble();

        if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            System.out.println("All numbers are equal.");
        } else if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            displayLargestNumber(firstNumber);
        } else if (secondNumber > thirdNumber && secondNumber > firstNumber) {
            displayLargestNumber(secondNumber);
        } else {
            displayLargestNumber(thirdNumber);
        }
    }

    public static void displayLargestNumber(double largestNumber) {
        System.out.print("\nThe largest number is: " + largestNumber);
    }
}
