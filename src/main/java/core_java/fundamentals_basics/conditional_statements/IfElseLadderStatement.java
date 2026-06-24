package core_java.fundamentals_basics.conditional_statements;

// If Else ladder (if...else...if) Statement
public class IfElseLadderStatement {
    public static void main(String[] args) {
        byte yourGrade = 89;

        if (yourGrade >= 95) {
            System.out.println("Excellent!");
        } else if (yourGrade >= 90) {
            System.out.println("Very Good!");
        } else if (yourGrade >= 75) {
            System.out.println("Good!");        // Output: Good!
        } else {
            System.out.println("Failed!");
        }
    }
}