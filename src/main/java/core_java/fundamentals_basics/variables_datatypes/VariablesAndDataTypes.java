package core_java.fundamentals_basics.variables_datatypes;

public class VariablesAndDataTypes {
    static boolean booleanDefaultValue;
    static int wholeNumberDefaultValue;
    static double floatingPointDefaultValue;

    public static void main(String[] args) {
        /*
        *   Primitive Types
        */

        // Boolean
        boolean isActive = true;

        System.out.println("Boolean default value: " + booleanDefaultValue);

        // Character
        char letter = 'Y';

        // Integer
        byte age = 30;
        short maxRate = 3200;
        int score = 35; // Default datatype if whole number -> int
        long largeNumber = 5_000_000_000_000L;

        System.out.println("Whole number default value :" + wholeNumberDefaultValue);

        // Floating-Point
        float floatPrice = 99.9f;
        double doublePrice = 99.9; // Default datatype if floating-point number -> double

        System.out.println("Floating-Point number default value: " + floatingPointDefaultValue);

        // Constants
        final byte MONTHS_IN_A_YEAR = 12;
        final double PI = 3.14159265359;

        System.out.println("Java Constants");
        System.out.println("Months in a year: " + MONTHS_IN_A_YEAR);
        System.out.println("The value of PI: " + PI);

        // Magic Number
        int radius = 5;

        System.out.println(radius * 3.14);  // Magic Number -> 3.14
        // Note: Avoid using magic number to make it readable and maintainable code.

        // Datatype value range using Wrapper Class
        System.out.println("Character MIN VALUE: " + Character.MIN_VALUE + " Character MAX VALUE: " + Character.MAX_VALUE);
        System.out.println("Byte MIN VALUE: " + Byte.MIN_VALUE + " Byte MAX VALUE: " + Byte.MAX_VALUE);
        System.out.println("Short MIN VALUE: " + Short.MIN_VALUE + " Short MAX VALUE: " + Short.MAX_VALUE);
        System.out.println("Integer MIN VALUE: " + Integer.MIN_VALUE + " Integer MAX VALUE: " + Integer.MAX_VALUE);
        System.out.println("Long MIN VALUE: " + Long.MIN_VALUE + " Long MAX VALUE: " + Long.MAX_VALUE);
        System.out.println("Float MIN VALUE: " + Float.MIN_VALUE + " Float MAX VALUE: " + Float.MAX_VALUE);
        System.out.println("Double MIN VALUE: " + Double.MIN_VALUE + " Double MAX VALUE: " + Double.MAX_VALUE);
    }
}
