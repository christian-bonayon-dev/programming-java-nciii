package core_java.fundamentals_basics.arrays;

public class SingleDimensionalArray {
    public static void main(String[] args) {
        // Array Initialization - Single Dimensional Array
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Array Traversal using for loop
        for (int index = 0; index < numbers.length; index++) {
            System.out.print(numbers[index] + " ");         // Output: 1 2 3 4 5 6 7 8 9 10
        }

        int whileIndex = 0;

        // Array Traversal using while loop
        while (whileIndex < numbers.length) {
            System.out.print(numbers[whileIndex] + " ");    // Output: 1 2 3 4 5 6 7 8 9 10

            whileIndex++;
        }

        int doWhileIndex = 0;

        // Array Traversal using do-while loop
        do {
            System.out.print(numbers[doWhileIndex] + " ");    // Output: 1 2 3 4 5 6 7 8 9 10

            doWhileIndex++;
        } while (doWhileIndex < numbers.length);

        // Array Traversal using enhanced for loop (foreach)
        for (int number : numbers) {
            System.out.print(number + " ");         // Output: 1 2 3 4 5 6 7 8 9 10
        }
    }
}