package core_java.intermediate.oop.inheritance.single_inheritance;

public class Program {
    public static void main(String[] args) {
        ClassB classB = new ClassB();

        classB.printFromClassA();   // Output: Printing from Class A...
        classB.printFromClassB();   // Output: Printing from Class B...

        /*
         *   Note: All exposed members (using public, package-private, protected access modifier)
         *   attributes and methods in parent class (ClassA) are inherited or accessible in child
         *   class (ClassB).
         */
    }
}