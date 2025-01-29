package course12.homework.challenge1;

import java.util.List;

public class PersonalInfo {

    String firstName;
    String lastName;
    String gender;
    int age;
    String birthday;
    long ssn;
    List<Address> homeAddress;
    List<ContactInfo> contactInfo;

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