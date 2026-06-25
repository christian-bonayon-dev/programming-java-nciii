package core_java.intermediate.oop.encapsulation;

public class Employee {
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;

    // Constructor - a special method that does not have a return type, not even void.
    public Employee(String firstName, String middleName, String lastName, String suffix) {
        this.firstName = firstName;     // "this" keyword refers to the current class.
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
    }

    // Getter (Accessor)
    public String getFirstName() {
        return firstName;
    }

    // Setter (Mutator)
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}