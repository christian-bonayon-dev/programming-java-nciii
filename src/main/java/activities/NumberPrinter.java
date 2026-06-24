package activities;

/*
    Activity 9: Print Numbers from 1 to N using a For Loop

    Objective:
        Learn how to use a for loop to print a sequence of numbers based on user input.

    Instructions:
        1. Create a Java class named NumberPrinter.
        2. In the main method:
            * Ask the user to input a number (positive integer).
            * Use a for loop to print all numbers from (inclusive).
            * Each number should appear on a new line.

    -----------------------------------------------
      Expected Sample Output:
    -----------------------------------------------
    Enter a number: 5

    1
    2
    3
    4
    5
*/

import java.util.Scanner;

public class NumberPrinter {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = userInput.nextInt();

        System.out.println();

        for (int index = 1; index <= number; index++) {
            System.out.println(index);
        }
    }
}
