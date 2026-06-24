package activities;

/*
    Activity 18: Try Again! Using do-while Loop for Valid Input

    Objective:
        Use a do-while loop to until the user enters a .

    Instructions:
        1. Create a Java class named PositiveNumberChecker.
        2. In the main method:
            * Use a do-while loop to .
            * If the number is negative or zero, ask again.
            * Exit the loop only if the input is a positive number.
        3. Print a message confirming the valid input.

    ------------------------------------------------------------
      Expected Sample Output:
    ------------------------------------------------------------
    Enter a number: -4
    Invalid. Please enter a positive number.
    Enter a number: 0
    Invalid. Please enter a positive number.
    Enter a number: 7
    Thank you! You entered: 7
*/

import java.util.Scanner;

public class PositiveNumberChecker {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        double number;

        do {
            System.out.print("Enter a number: ");
            number = userInput.nextDouble();

            if (number <= 0) {
                System.out.println("Invalid. Please enter a positive number.");
            }
        } while (number <= 0);

        System.out.println("Thank you! You entered: " + number);
    }
}
