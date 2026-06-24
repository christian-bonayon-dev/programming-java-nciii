package activities;

/*
    Activity 3: Let's Do the Math — Basic Arithmetic in Java

    Objective:
        Practice using variables and arithmetic operators (+, -, *, /, %) to solve simple math problems using Java.

    Instructions:
        1. Create a new Java class named SimpleCalculator.
        2. In your main method:
            * Ask the user to enter two numbers.
            * Store the values using appropriate variables.
            * Perform the following operations:
                - Addition
                - Subtraction
                - Multiplication
                - Division
                - Modulo (remainder)
        3. Display the results in a clear and formatted output.
        4. Test your program using your own input.

    Sample Output:
    Enter first number: 15
    Enter second number: 4

    Results:
    Sum: 19.0
    Difference: 11.0
    Product: 60.0
    Quotient: 3.75
    Remainder: 3.0
*/

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNumber = userInput.nextDouble();

        System.out.print("Enter second number: ");
        double secondNumber = userInput.nextDouble();

        System.out.println(
                "\nResults:\nSum: " + addition(firstNumber, secondNumber)
                        + "\nDifference: " + subtraction(firstNumber, secondNumber)
                        + "\nProduct: " + multiplication(firstNumber, secondNumber)
                        + "\nQuotient: " + division(firstNumber, secondNumber)
                        + "\nRemainder: " + modulo(firstNumber, secondNumber));
    }

    public static double addition(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static double subtraction(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public static double multiplication(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public static double division(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    public static double modulo(double firstNumber, double secondNumber) {
        return firstNumber % secondNumber;
    }
}