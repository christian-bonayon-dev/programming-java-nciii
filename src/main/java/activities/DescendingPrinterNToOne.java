package com.activities;

/*
    Activity 14: Print Numbers from N to 1 using a For Loop (Descending)

    Objective:
        Practice using a for loop to print numbers , from .

    Instructions:
        1. Create a Java class named DescendingPrinter.
        2. In the main method:
            * Ask the user to enter a number .
            * Use a for loop to print numbers starting from .
            * Each number should appear on a new line.

    Challenge (Bonus Points):
        Add a message like: Loop complete! after the list ends.

    ----------------------------------------------
      Expected Sample Output:
    ----------------------------------------------
    Enter a number: 5

    5
    4
    3
    2
    1
*/

import java.util.Scanner;

public class DescendingPrinterNToOne {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = userInput.nextInt();

        System.out.println();

        for (int index = number; index > 0; index--) {
            System.out.println(index);

            if (index == 1) {
                System.out.println("Loop complete!");
            }
        }
    }
}
