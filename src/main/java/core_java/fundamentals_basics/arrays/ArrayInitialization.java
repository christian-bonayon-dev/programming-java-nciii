package core_java.fundamentals_basics.arrays;

public class ArrayInitialization {
    public static void main(String[] args) {
        char[] letters = {'A', 'B', 'C', 'D', 'E'};   // Array Initialization

        // Array Traversal
        for (int index = 0; index < letters.length; index++) {
            System.out.print(letters[index] + " ");    // Output: A B C D E
        }
    }
}