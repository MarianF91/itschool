package course12.homework.challenge1;

public class PersonalInfo {

    String firstName;
    String lastName;
    String sex;
    int age;
    String birthday;
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