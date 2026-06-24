package core_java.fundamentals_basics.jump_statements;

public class ContinueStatement {
    public static void main(String[] args) {
        for (int count = 1; count <= 10; count++) {
            if (count == 6) {
                continue;      // <--skip the current iteration
            }

            System.out.print(count + " ");      // Output: 1 2 3 4 5 7 8 9 10
        }
    }
}