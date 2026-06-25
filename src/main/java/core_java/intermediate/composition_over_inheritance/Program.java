package core_java.intermediate.composition_over_inheritance;

public class Program {
    public static void main(String[] args) {
        Address address = new Address("456 P. Noval St", "Rm 201, Sampaloc", "Brgy. 123", "Manila", "NCR", "Metro Manila", "1008");
        ContactDetails contactDetails = new ContactDetails("juan.delacruz@gmail.com", "09123456789", "(02) 1234 567");
        Student student = new Student(1, "Juan", "D", "Dela Cruz", "Jr.", "BSCS", contactDetails, address);

        System.out.println(student.toString());     // Output: Student{id=1, firstName='Juan', middleName='D', lastName='Dela Cruz', suffix='Jr.', course='BSCS', contactDetails=ContactDetails{emailAddress='juan.delacruz@gmail.com', mobileNumber='09123456789', telephoneNumber='(02) 1234 567'}, address=Address{addressLine1='456 P. Noval St', addressLine2='Rm 201, Sampaloc', barangay='Brgy. 123', city='Manila', region='NCR', province='Metro Manila', zipCode='1008'}}

        /*
         *
         *   In Java, Composition is the design technique in object-oriented programming to implement has-a relationship between objects.
         *   Favoring composition over inheritance is best practice in OOP that leads to more flexible, maintainable, and testable code.
         *   Inheritance is tightly coupled whereas composition is loosely coupled.
         *
         */
    }
}