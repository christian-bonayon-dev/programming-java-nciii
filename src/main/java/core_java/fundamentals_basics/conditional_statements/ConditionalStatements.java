package core_java.fundamentals_basics.conditional_statements;

public class ConditionalStatements {
    public static void main(String[] args) {
        byte currentAge = 20;
        final byte LEGAL_AGE = 18;

        /*
        *   If Statement (if-then)
        */
        if(currentAge > LEGAL_AGE) {
            System.out.println("You are in a legal age.");
        }

        /*
         *   If-Else Statement (if-then-else)
         */
        if(currentAge >= LEGAL_AGE) {
            System.out.println("You are allowed to vote.");
        } else {
            System.out.println("You are not allowed to vote.");
        }

        /*
         *   If-Else-If Statement (if...else...if)
         */
        byte yourGrade = 89;

        if(yourGrade >= 95) {
            System.out.println("Excellent!");
        } else if(yourGrade >= 90) {
            System.out.println();
        }
    }
}
