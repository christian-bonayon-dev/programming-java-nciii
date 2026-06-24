package core_java.fundamentals_basics.operators;

public class Operators {
    public static void main(String[] args) {
        /*
        *   Arithmetic Operators
        */

        // Addition Operator
        int sum = 4 + 2;
        System.out.println(sum);            // Output: 6

        // Subtraction Operator
        int difference = 4 - 2;
        System.out.println(difference);     // Output: 2

        // Multiplication Operator
        int product = 4 * 2;
        System.out.println(product);        // Output: 8

        // Division Operator
        int quotient = 4 / 2;
        System.out.println(quotient);        // Output: 2

        // Modulo Operator
        int modulo = 4 / 2;
        System.out.println(modulo);          // Output: 2


        /*
         *   Assignment Operators (Augmented Assignment Operators)
         */

        // Assignment Operator
        int num1 = 5;
        System.out.println(num1);   // Output: 5

        // Addition and Assignment Operator
        int num2 = 5;
        num2 += 2;
        System.out.println(num2);   // Equivalent: 7 = 5 + 2 Output: 7

        // Subtraction and Assignment Operator
        int num3 = 5;
        num3 -= 2;
        System.out.println(num3);   // Equivalent: 3 = 5 - 2 Output: 3

        // Multiplication and Assignment Operator
        int num4 = 5;
        num4 *= 2;
        System.out.println(num4);   // Equivalent: 10 = 5 * 2 Output: 10

        // Division and Assignment Operator
        int num5 = 5;
        num5 /= 2;
        System.out.println(num5);   // Equivalent: 2 = 5 / 2 Output: 2

        // Modulo and Assignment Operator
        int num6 = 5;
        num6 %= 2;
        System.out.println(num6);   // Equivalent: 1 = 5 / 2 Output: 1


        /*
         *   Relational Operators
         */

        // Is Equal To
        System.out.println(5 == 5);     // Output: true     (5 == 5) -> Boolean Expression

        // Not Equal To
        System.out.println(5 != 4);     // Output: true

        // Greater Than
        System.out.println(4 > 1);      // Output: true

        // Less Than
        System.out.println(4 < 1);      // Output: false

        // Greater Than or Equal To
        System.out.println(4 >= 1);     // Output: true

        // Less Than or Equal To
        System.out.println(4 <= 1);     // Output: false


        /*
         *   Logical Operators
         */

        // Logical AND
        System.out.println(5 == 5 && 4 > 1);     // Output: true

        // Logical OR
        System.out.println(5 == 5 || 4 < 1);     // Output: true

        // Logical NOT
        boolean isFourIsLessThanOne = 4 < 1;
        System.out.println(!isFourIsLessThanOne);     // Output: true

        // Short Circuit AND - if the left-hand operand is false, the right-hand expression is not evaluated.
        // Equivalent: true && true && false && true && true
        System.out.println(5 == 5 && 4 > 1 && 1 > 5 && 5 > 1 && 7 > 2);     // Output: false

        // Short Circuit OR - if the left-hand operand is true, the right-hand expression is not evaluated.
        // Equivalent: false || false || false || true || false || false
        System.out.println(7 < 1 || 4 > 10 || 1 > 2 || 2 < 20 || 1 > 2 || 5 > 10);  // Output: true


        /*
         *   Unary Operators
         */

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
