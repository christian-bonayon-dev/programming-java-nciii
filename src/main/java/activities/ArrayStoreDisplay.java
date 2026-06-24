package com.activities;

/*
    Activity 21: Introduction to Arrays — Store and Display Integers

    Objective:
        Understand how to declare, initialize, and access elements in a .

    Instructions:
        1. Create a Java class named ArrayDisplay.
        2. In your main method:
            * Declare an integer array that can store .
            * Ask the user to input and store them in the array.
            * Use a loop to print all the values stored in the array.

    -----------------------------------------------
      Expected Sample Output:
    -----------------------------------------------
    Enter 5 numbers:
    10
    20
    30
    40
    50

    You entered:
    10
    20
    30
    40
    50
*/

import java.util.Scanner;

public class ArrayStoreDisplay {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");

        int index = 0;

        while (index < numbers.length) {
            numbers[index] = userInput.nextInt();

            index++;
        }

        System.out.println("\nYou entered:");

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
