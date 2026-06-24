package core_java.fundamentals_basics.jump_statements;

public class BreakStatement {
    public static void main(String[] args) {
        for (int count = 1; count <= 10; count++) {
            System.out.print(count + " ");      // Output: 1 2 3 4 5 6

            if (count == 6) {
                break;      // <--exit out in loop
            }
        }
    }
}