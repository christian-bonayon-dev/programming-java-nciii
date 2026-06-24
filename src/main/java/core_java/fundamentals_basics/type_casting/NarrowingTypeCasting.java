package core_java.fundamentals_basics.type_casting;

// Narrowing Type Casting (Explicit Type Casting)
public class NarrowingTypeCasting {
    public static void main(String[] args) {
        double price = 99.9;
        int totalPrice = (int) price;

        System.out.println(totalPrice);     // Output: 99

        // Note: Be mindful of potential data loss.
    }
}