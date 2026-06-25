package core_java.intermediate.oop.polymorphism.method_overloading;

public class Program {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(1, 2));       // Output: 3
        System.out.println(calculator.add(1, 2, 3));    // Output: 6
        System.out.println(calculator.add(23.45, 3.1416));  // Output: 26.5916
    }
}