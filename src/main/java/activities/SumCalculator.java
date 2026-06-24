package activities;

/*
    Activity 17: Sum of N Numbers

    Objective:
        Use a loop to calculate from 1 to N, where is entered by the user.

    Instructions:
        1. Create a Java class named SumCalculator.
        2. In the main method:
            * Ask the user to enter a number .
            * Use a loop to add all numbers from .
            * Display the total sum at the end.

    ------------------------------------------------
      Expected Sample Output:
    ------------------------------------------------
    Enter a number: 5
    The sum from 1 to 5 is: 15

    ------------------------------------------------
    Challenge (Bonus Points):
        Show the full math expression (e.g., 1 + 2 + 3 + 4 + 5 = 15)
        Solve the same task using a while loop
*/

import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        StringBuilder mathExpressionBuilder = new StringBuilder();

        System.out.print("Enter a number: ");
        int number = userInput.nextInt();

        int counter = 1;
        int totalSum = 0;


        while (counter <= number) {
            totalSum += counter;

            mathExpressionBuilder
                    .append(counter)
                    .append(" ");

            if (counter == number) {
                mathExpressionBuilder
                        .append("=")
                        .append(" ");

                break;
            }

            mathExpressionBuilder
                    .append("+")
                    .append(" ");

            counter++;
        }

        System.out.println("The sum from 1 to " + number + " is: " + totalSum);
        System.out.println("\nMath Expression: " + mathExpressionBuilder + totalSum);
    }
}
