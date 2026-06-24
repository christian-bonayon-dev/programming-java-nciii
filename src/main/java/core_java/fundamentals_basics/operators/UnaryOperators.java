package core_java.fundamentals_basics.operators;

public class UnaryOperators {
    public static void main(String[] args) {
        // Prefix (Pre-Increment)
        int preIncrementScore = 0;

        // Increment score first before print
        System.out.println(++preIncrementScore);    // Equivalent: score + 1    Output: 1

        // Postfix (Post-Increment)
        int postIncrementScore = 0;

        // Print score first before increment
        System.out.println(postIncrementScore++);   // Output: 0

        System.out.println(postIncrementScore);     // Output: 1

        // Note: Same as Decrement both Pre-Decrement and Post-Decrement, the difference is decreasing the value by 1.
    }
}