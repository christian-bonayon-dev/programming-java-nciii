package core_java.fundamentals_basics.methods;

public class Methods {
    public static void main(String[] args) {
        // Calling a Method
        displayHelloWorld();

        System.out.println(canVote(15));

        System.out.println("Sum of two numbers: " + add(1, 1));
    }

    // Method Declaration (void)
    public static void displayHelloWorld() {
        System.out.println("Hello World");
    }

    // Method Declaration (boolean)
    public static boolean canVote(int currentAge) {
        return currentAge > 18;
    }

    // Method Declaration (int)
    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}