package core_java.fundamentals_basics.variables_datatypes;

// Datatype value range using Wrapper Class
public class DatatypeValueRanges {
    public static void main(String[] args) {
        System.out.println("Character MIN VALUE: " + (int) Character.MIN_VALUE + " Character MAX VALUE: " + (int) Character.MAX_VALUE);     // Output: Character MIN VALUE: 0 Character MAX VALUE: 65535
        System.out.println("Byte MIN VALUE: " + Byte.MIN_VALUE + " Byte MAX VALUE: " + Byte.MAX_VALUE);                                     // Output: Byte MIN VALUE: -128 Byte MAX VALUE: 127
        System.out.println("Short MIN VALUE: " + Short.MIN_VALUE + " Short MAX VALUE: " + Short.MAX_VALUE);                                 // Output: Short MIN VALUE: -32768 Short MAX VALUE: 32767
        System.out.println("Integer MIN VALUE: " + Integer.MIN_VALUE + " Integer MAX VALUE: " + Integer.MAX_VALUE);                         // Output: Integer MIN VALUE: -2147483648 Integer MAX VALUE: 2147483647
        System.out.println("Long MIN VALUE: " + Long.MIN_VALUE + " Long MAX VALUE: " + Long.MAX_VALUE);                                     // Output: Long MIN VALUE: -9223372036854775808 Long MAX VALUE: 9223372036854775807
        System.out.println("Float MIN VALUE: " + Float.MIN_VALUE + " Float MAX VALUE: " + Float.MAX_VALUE);                                 // Output: Float MIN VALUE: 1.4E-45 Float MAX VALUE: 3.4028235E38
        System.out.println("Double MIN VALUE: " + Double.MIN_VALUE + " Double MAX VALUE: " + Double.MAX_VALUE);                             // Output: Double MIN VALUE: 4.9E-324 Double MAX VALUE: 1.7976931348623157E308
    }
}