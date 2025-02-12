package course12and13.homework.challenge1;

public class PersonalInfo {

    String firstName;
    String lastName;
    String gender;
    int age;
    String birthday;
    long ssn;
    Address homeAddress = new Address();
    ContactInfo contactInfo = new ContactInfo();

    @Override
    public String toString() {
        return "PersonalInfo{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", birthday='" + birthday + '\'' +
                ", SSN=" + ssn +
                ", homeAddress=" + homeAddress +
                ", contactInfo=" + contactInfo +
                '}';
    }
}