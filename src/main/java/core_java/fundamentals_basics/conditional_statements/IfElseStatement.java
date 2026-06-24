package core_java.fundamentals_basics.conditional_statements;

// If Else (if-then-else) Statement
public class IfElseStatement {
    public static void main(String[] args) {
        byte currentAge = 15;
        final byte LEGAL_AGE = 18;

        if(currentAge >= LEGAL_AGE) {
            System.out.println("You are allowed to vote.");
        } else {
            System.out.println("You are not allowed to vote.");     // Output: You are not allowed to vote.
        }
    }
}