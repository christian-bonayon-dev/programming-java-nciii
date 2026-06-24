package core_java.fundamentals_basics.precedence;

/*
*   Operator Precedence (Completed)
*
*   ( )     - Parenthesis
*   ++      - Increment and Decrement
*   *, /, % - Multiplicative
*   +, -    - Additive
*/
public class OperatorPrecedence {
    public static void main(String[] args) {
        int total = 4 / 4 * 5 - 4 + 4;

        /*
        *   Breakdown:
        *
        *   total = 4 / 4 * 5 - 4 + 4;
        *   total =     1 * 5 - 4 + 4;
        *   total =         5 - 4 + 4;
        *   total =             1 + 4;
        *   total =                 5;
        */

        System.out.println(total);      // Output: 5
    }
}