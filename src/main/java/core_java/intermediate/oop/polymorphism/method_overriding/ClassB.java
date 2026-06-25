package core_java.intermediate.oop.polymorphism.method_overriding;

public class ClassB extends ClassA {

    @Override
    public void print() {
        System.out.println("Printing from Class B...");
    }
}