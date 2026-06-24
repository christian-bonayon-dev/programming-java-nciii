package core_java.fundamentals_basics.looping_statements;

public class WhileLoop {
    public static void main(String[] args) {
        int count = 1;  // Initialization (* It depends on requirements)

        while(count <= 10) {
            System.out.println(count);

            count++;    // Use increment operator to avoid infinite loop (* It depends on requirements)
        }

        // Note: If the number of iteration is not fixed, it is recommended to use while loop.
    }
}