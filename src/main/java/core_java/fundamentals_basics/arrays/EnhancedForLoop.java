package core_java.fundamentals_basics.arrays;

public class EnhancedForLoop {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Array Traversal
        for (int number : numbers) {
            System.out.print(number + " ");     // Output: 1 2 3 4 5 6 7 8 9 10
        }
    }
}