package com.activities;

/*
    Activity 8: Fahrenheit to Celsius Converter

    Objective:
        Learn how to apply mathematical formulas in Java using variables and user input.

    Instructions:
        1. Create a Java class named FahrenheitToCelsius.
        2. In your main method:
            * Ask the user to input a temperature in Fahrenheit.
            * Convert it to Celsius using the formula :
                Celsius = (Fahrenheit−32) * 5 / 9
        3. Display the result to 2 decimal places.

    --------------------------------------------------------
      Expected Sample Output:
    --------------------------------------------------------
    Enter temperature in Fahrenheit: 98.6
    Temperature in Celsius: 37.00°C
*/

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        float fahrenheit = userInput.nextFloat();

        System.out.printf("Temperature in Celsius: %.2f °C", fahrenheitToCelsiusConverter(fahrenheit));
    }

    public static double fahrenheitToCelsiusConverter(float fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
