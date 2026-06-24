package com.activities;

/*
    Activity 22: Search for a Number in an Array

    Objective:
        Practice using a loop to for a specific number in a .

    Instructions:
        1. Create a Java class named ArraySearch.
        2. In the main method:
            * Declare a predefined array:
                int[] numbers = {5, 12, 7, 9, 23, 18};
            * Ask the user to enter a number to .
            * Use a for loop to check if the number exists in the array.
            * If found, print the where it was found.
            * If not found, display a message: “Number not found.”

    ----------------------------------------
    Expected Sample Output:
    ----------------------------------------
    Enter a number to search: 9
    Number 9 found at index 3

    ---
    Enter a number to search: 15
    Number 15 not found in the array.
*/

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int[] numbers = {5, 12, 7, 9, 23, 18};

        System.out.print("Enter a number to search: ");
        int searchNumber = userInput.nextInt();

        int index = 0;

        while (index < numbers.length) {
            if (numbers[index] == searchNumber) {
                System.out.println("Number " + searchNumber + " found at index " + index);
                break;
            }

            index++;
        }

        if (index == numbers.length) {
            System.out.println("Number " + searchNumber + " not found in the array.");
        }
    }
}
