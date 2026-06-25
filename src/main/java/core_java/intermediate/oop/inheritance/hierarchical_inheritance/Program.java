package core_java.intermediate.oop.inheritance.hierarchical_inheritance;

public class Program {
    public static void main(String[] args) {
        ClassB classB = new ClassB();
        ClassC classC = new ClassC();

        classB.printFromClassA();       // Output: Printing from Class A...
        classB.printFromClassB();       // Output: Printing from Class B...

        classC.printFromClassA();       // Output: Printing from Class A...
        classC.printFromClassC();       // Output: Printing from Class C...
    }
}