package core_java.intermediate.oop.inheritance.multilevel_inheritance;

public class Program {
    public static void main(String[] args) {
        ClassC classC = new ClassC();

        classC.printFromClassA();       // Output: Printing from Class A...
        classC.printFromClassB();       // Output: Printing from Class B...
        classC.printFromClassC();       // Output: Printing from Class C...

        /*
         *  Note: Avoid deep inheritance to make it easier to maintain.
         *  The ideal maximum depth in multilevel inheritance is 4 levels.
         */
    }
}