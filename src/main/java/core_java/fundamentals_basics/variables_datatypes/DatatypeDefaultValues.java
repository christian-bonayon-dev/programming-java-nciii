package core_java.fundamentals_basics.variables_datatypes;

public class DatatypeDefaultValues {
    static boolean booleanDefaultValue;
    static char characterDefaultValue;
    static byte byteDefaultValue;
    static short shortDefaultValue;
    static int intDefaultValue;
    static long longDefaultValue;
    static float floatDefaultValue;
    static double doubleDefaultValue;

    public static void main(String[] args) {
        System.out.println("Boolean default value: " + booleanDefaultValue);            // Output: Boolean default value: false
        System.out.println("Character default value: " + (int) characterDefaultValue);  // Output: Character default value: 0 or '\u0000'
        System.out.println("Integer default values: ");                                 // Output: Integer default values:
        System.out.println("\tByte: " + byteDefaultValue);                              // Output:     Byte: 0
        System.out.println("\tShort: " + shortDefaultValue);                            // Output:     Short: 0
        System.out.println("\tInt: " + intDefaultValue);                                // Output:     Int: 0   (default)
        System.out.println("\tLong: " + longDefaultValue);                              // Output:     Long: 0
        System.out.println("Floating-Point default values: ");                          // Output: Floating-Point default values:
        System.out.println("\tFloat: " + floatDefaultValue);                            // Output:     Float: 0.0
        System.out.println("\tDouble: " + doubleDefaultValue);                          // Output:     Double: 0.0  (default)
    }
}