package core_java.intermediate.oop.polymorphism.method_overloading;

public class Calculator {
    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int add(int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber + secondNumber + thirdNumber;
    }

    public double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }
}