package core_java.fundamentals_basics.operators;

public class ShortCircuiting {
    public static void main(String[] args) {
        // Short Circuit AND - if the left-hand operand is false, the right-hand expression is not evaluated.

        // Equivalent: true && true && false && true && true
        System.out.println(5 == 5 && 4 > 1 && 1 > 5 && 5 > 1 && 7 > 2);             // Output: false

        // Short Circuit OR - if the left-hand operand is true, the right-hand expression is not evaluated.

        // Equivalent: false || false || false || true || false || false
        System.out.println(7 < 1 || 4 > 10 || 1 > 2 || 2 < 20 || 1 > 2 || 5 > 10);  // Output: true
    }
}