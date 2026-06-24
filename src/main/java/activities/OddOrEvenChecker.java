package activities;

/*
    Activity 7: Odd or Even Checker

    Objective:
        Understand how to use the modulo operator (%) and if-else statements in Java to determine if a number is or .

    Instructions:
        1. Create a Java class named OddOrEvenChecker.
        2. In the main method:
            * Ask the user to input an integer.
            * Store the number in a variable.
            * Use an if-else statement to check if the number is or .
            * A number is even  if number % 2 == 0
            * Otherwise, it is odd
        3. Print whether the number is odd or even.

    -------------------------------------------------------------------
    Sample Output 1:
    Enter a number: 12
    12 is even.

    Sample Output 2:
    Enter a number: 7
    7 is odd.
*/

import java.util.Scanner;

public class OddOrEvenChecker {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = userInput.nextInt();

        System.out.println(number + " is " + evenOddIdentifier(isEvenNumber(number)) + ".");
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    public static String evenOddIdentifier(boolean isEvenNumber) {
        return isEvenNumber ? "even" : "odd";
    }
}
