package core_java.fundamentals_basics.conditional_statements;

public class IfStatement {
    public static void main(String[] args) {
        byte currentAge = 20;
        final byte LEGAL_AGE = 18;

        if(currentAge > LEGAL_AGE) {
            System.out.println("You are in a legal age.");
        }
    }
}