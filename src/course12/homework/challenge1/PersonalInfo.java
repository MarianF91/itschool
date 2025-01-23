package course12.homework.challenge1;

import java.time.LocalDate;

public class PersonalInfo {

    String firstName;
    String lastName;
    String sex;
    int age;
    LocalDate birthday;
    long ssn;

    @Override
    public String toString() {
        return "PersonalInfo{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", ssn=" + ssn +
                '}';
    }
}