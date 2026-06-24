package core_java.fundamentals_basics.conditional_statements;

// Ternary Operator (Shorthand if...else)
public class TernaryOperator {
    public static void main(String[] args) {
        int grade = 88;

        String result = (grade >= 75) ? "Passed" : "Failed";

        System.out.println("Result: " + result);    // Output: Passed
    }
}
