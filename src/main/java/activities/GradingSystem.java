package activities;

/*
    Activity 11: Grading System using If-Else

    Objective:
        Use if-else statements to evaluate conditions and assign grades based on a student's score.

    Instructions:
        1. Create a Java class named GradingSystem.
        2. In your main method:
            * Ask the user to input a (0–100).
            * Use if-else if conditions to determine the equivalent letter grade:
            * 90 - 100 → Grade A
            * 80 - 89 → Grade B
            * 70 - 79 → Grade C
            * 60 - 69 → Grade D
            * < 60 → Grade F
        3. Display the letter grade based on the score.

    -------------------------------------------
    Expected Sample Output
    -------------------------------------------
    Enter your score: 87
    Your grade is: B

    Enter your score: 59
    Your grade is: F
*/

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter your score: ");
        byte grade = userInput.nextByte();

        if (grade >= 90) {
            displayLetterGrade('A');
        } else if (grade >= 80) {
            displayLetterGrade('B');
        } else if (grade >= 70) {
            displayLetterGrade('C');
        } else if (grade >= 60) {
            displayLetterGrade('D');
        } else {
            displayLetterGrade('F');
        }
    }

    public static void displayLetterGrade(char letterGrade) {
        System.out.print("Your grade is: " + letterGrade);
    }
}
