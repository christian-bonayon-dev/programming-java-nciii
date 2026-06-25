package core_java.intermediate.oop.polymorphism.abstract_classes;

public class Program {
    public static void main(String[] args) {
        Square square = new Square();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        square.print();     // Output: Printing Square....
        circle.print();     // Output: Printing Circle....
        rectangle.print();  // Output: Printing Rectangle....
    }
}