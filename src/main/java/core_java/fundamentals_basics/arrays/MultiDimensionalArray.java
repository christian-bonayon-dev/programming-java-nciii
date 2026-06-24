package core_java.fundamentals_basics.arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        // Array Initialization - Multidimensional Array
        int[][] numbers = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10}
        };

        // Array Traversal using for loop
        for (int row = 0; row < numbers.length; row++) {
            for (int column = 0; column < numbers[row].length; column++) {
                System.out.print(numbers[row][column] + " ");         // Output: 1 2 3 4 5 6 7 8 9 10
            }
        }

        // Array Traversal using enhanced for loop (foreach)
        for (int[] row : numbers) {
            for (int column : row) {
                System.out.print(column + " ");         // Output: 1 2 3 4 5 6 7 8 9 10
            }
        }
    }
}