package core_java.fundamentals_basics.looping_statements;

public class DoWhileLoop {
    public static void main(String[] args) {
        int count = 1;  // Initialization (* It depends on requirements)

        do {
            System.out.println(count);

            count++;    // Use increment operator to avoid infinite loop (* It depends on requirements)
        } while(count <= 10);

        // Note: Use it if the number of iteration is not fixed, and you must have to execute the code block at least once.
    }
}