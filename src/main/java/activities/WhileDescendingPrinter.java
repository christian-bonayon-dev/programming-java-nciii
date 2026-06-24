package activities;

/*
    Activity 16: Print Numbers from N to 1 using a While Loop (Descending)

    Objective:
        Practice controlling a while loop to count down from a number to 1.

    Instructions:
        1. Create a Java class named WhileDescendingPrinter.
        2. In the main method:
            * Ask the user to enter a number .
            * Use a while loop to print numbers from .
            * Decrease the counter each time until the loop ends.

    ------------------------------------------------
      Expected Sample Output:
    ------------------------------------------------
    Enter a number: 5

    5
    4
    3
    2
    1
*/

import java.util.Scanner;

public class WhileDescendingPrinter {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int counter = userInput.nextInt();

        System.out.println();

        while (counter > 0) {
            System.out.println(counter);

            counter--;
        }
    }
}
