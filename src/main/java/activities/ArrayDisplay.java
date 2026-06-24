package com.activities;

/*
    Activity 20: Display Elements of a Predefined Array (Enhanced For Loop)

    Objective:
        Learn how to use an array to display elements of a .

    Instructions:
        1. Create a Java class named ArrayDisplay.
        2. In the main method:
            * Declare and initialize an array with these values:
                int[] numbers = {12, 25, 37, 44, 59};
            * Use an enhance for loop to print each value in the array.

    ---------------------------------
      Expected Output:
    ---------------------------------
    Array contents:
    12
    25
    37
    44
    59

    ---------------------------------
     Challenge (Bonus Points):
    ---------------------------------
    * Count how many numbers are greater than 30.
*/

public class ArrayDisplay {
    public static void main(String[] args) {
        int[] numbers = {12, 25, 37, 44, 59};

        // The count of numbers greater than 30
        int largerNumbers = 0;

        System.out.println("Array contents: ");

        for (int number : numbers) {
            System.out.println(number);

            if (number > 30) {
                largerNumbers++;
            }
        }

        System.out.println("\nCount of numbers greater than 30: " + largerNumbers);
    }
}
