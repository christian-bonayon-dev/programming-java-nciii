package core_java.intermediate.oop.inheritance.composition_over_inheritance;

public class ContactDetails {
    private String emailAddress;
    private String mobileNumber;
    private String telephoneNumber;

    public ContactDetails(String emailAddress, String mobileNumber, String telephoneNumber) {
        this.emailAddress = emailAddress;
        this.mobileNumber = mobileNumber;
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public String toString() {
        return "ContactDetails{" +
                "emailAddress='" + emailAddress + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                '}';
    }
}