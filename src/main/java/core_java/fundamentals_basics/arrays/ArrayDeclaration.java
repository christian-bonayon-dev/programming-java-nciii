package core_java.fundamentals_basics.arrays;

public class ArrayDeclaration {
    public static void main(String[] args) {
        int[] arrayNumbers = new int[5];        // Array Declaration

        arrayNumbers[0] = 100;                  // Initialize 1st element
        arrayNumbers[1] = 200;                  // Initialize 2nd Element
        arrayNumbers[2] = 300;                  // Initialize 3rd Element
        arrayNumbers[3] = 400;                  // Initialize 4th Element
        arrayNumbers[4] = 500;                  // Initialize 5th Element

        // Array Traversal
        for (int index = 0; index < arrayNumbers.length; index++) {
            System.out.print(arrayNumbers[index] + " ");    // Output: 100 200 300 400 500
        }
    }
}