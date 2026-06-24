package core_java.fundamentals_basics.type_casting;

public class TypeCasting {
    public static void main(String[] args) {
        // Widening Type Casting (Implicit Type Casting)
        int num = 10;
        double convertedNumber = num;

        System.out.println(convertedNumber);    // Output: 10.0

        // Narrowing Type Casting (Explicit Type Casting)
        double price = 99.9;
        int totalPrice = (int) price;

        System.out.println(totalPrice);     // Output: 99
        // Note: Be mindful of potential data loss.
    }
}
