package core_java.fundamentals_basics.operators;

public class LogicalOperators {
    public static void main(String[] args) {
        // Logical AND
        System.out.println(5 == 5 && 4 > 1);        // Output: true

        // Logical OR
        System.out.println(5 == 5 || 4 < 1);        // Output: true

        // Logical NOT
        boolean isFourIsLessThanOne = 4 < 1;
        System.out.println(!isFourIsLessThanOne);   // Output: true
    }
}