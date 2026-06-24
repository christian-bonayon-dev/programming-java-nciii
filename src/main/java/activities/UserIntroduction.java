package activities;

/*
    Activity 2: Getting to Know You — Input & Variables in Java

    Objective:
        Learn how to use variables and the Scanner class to accept input from the user and display personalized output.

    Instructions:
        1. Create a new Java class file named UserIntroduction.java.
        2. Complete the TODOs to:
            * Accept name, age, and favorite hobby
            * Store them in variables
            * Print a short introduction using the input

    Sample output:
    What is your name?
    user input: Alex
    How old are you?
    user input: 18
    What is your favorite hobby?
    user input: Drawing

    Nice to meet you, Alex!
    You are 18 years old and love Drawing.
*/

import java.util.Scanner;

public class UserIntroduction {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("What is your name? ");
        System.out.print("user input: ");
        String name = userInput.nextLine();

        System.out.println("How old are you? ");
        System.out.print("user input: ");
        byte age = userInput.nextByte();

        userInput.nextLine();

        System.out.println("What is your favorite hobby? ");
        System.out.print("user input: ");
        String hobby = userInput.nextLine();

        System.out.println("\nNice to meet you, " + name + "!");
        System.out.println("You are " + age + " years old and love " + hobby + ".");
    }
}
