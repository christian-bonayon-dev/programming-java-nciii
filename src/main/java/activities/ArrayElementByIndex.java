package activities;

/*
    Activity 24: Get Array Element by Index

    Objective:
        Learn how to access specific elements in an array using an .

    Instructions:
        1. Create a Java class named ArrayElementByIndex.
        2. In the main method:
            * Declare array of integers:
                int[] numbers = {10, 20, 30, 40, 50};
            * Ask the user to (0 to 4).
            * Print the value at that index.
            * If the index is out of bounds, print an error message.

    ----------------------------------------------
      Expected Sample Output:
    ----------------------------------------------
    Enter an index (0-4): 2
    The value at index 2 is: 30

    Enter an index (0-4): 5
    Invalid index! Please enter a number between 0 and 4.

    ----------------------------------------------
    Challenge (Bonus Points):
    ----------------------------------------------
     * Allow the user to keep trying until a valid index is entered (do-while loop).
*/

import java.util.Scanner;

public class ArrayElementByIndex {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int[] numbers = {10, 20, 30, 40, 50};
        boolean isIndexOutOfBounds = false;
        int index;

        do {
            System.out.print("Enter an index (0-4): ");
            index = userInput.nextByte();

            if (index < 0) {
                System.out.println("Invalid index! Please enter a number between 0 and 4.");

                isIndexOutOfBounds = true;
            } else if (index < numbers.length) {
                System.out.println("The value at index " + index + " is: " + numbers[index]);

                isIndexOutOfBounds = false;
            } else {
                System.out.println("Invalid index! Please enter a number between 0 and 4.");
                isIndexOutOfBounds = true;
            }
        } while (isIndexOutOfBounds);
    }
}
