package activities;

/*
    Activity 15: Print Numbers from 1 to N using a While Loop

    Objective:
        Understand how to use a while loop to repeatedly execute code based on a condition.

    Instructions:
        1. Create a Java class named WhileLoopCounter.
        2. In your main method:
            * Ask the user to enter a number .
            * Use a while loop to print numbers from (inclusive).
            * Use a counter variable initialized to 1 and increment it inside the loop.

    -------------------------------------------
     Expected Sample Output
    -------------------------------------------
    Enter a number: 4

    1
    2
    3
    4
*/

import java.util.Scanner;

public class WhileLoopCounter {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = userInput.nextInt();

        int counter = 1;

        System.out.println();

        while (counter <= number) {
            System.out.println(counter);

            counter++;
        }
    }
}
