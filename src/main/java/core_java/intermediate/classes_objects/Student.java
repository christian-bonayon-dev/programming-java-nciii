package core_java.intermediate.classes_objects;

// Class - is a blueprint/template used to create an object(s).
public class Student {
    // Attributes (State) - Refers to the characteristics of a class.
    public long id;
    public String firstName;        // Fields - a variable declared within a class.
    public String middleName;
    public String lastName;
    public String course;

    // Methods (Behavior) - action that can be performed.
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}