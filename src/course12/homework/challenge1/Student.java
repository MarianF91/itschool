package course12.homework.challenge1;

import java.util.ArrayList;
import java.util.List;

public class Student {

    PersonalInfo studentPersonalInfo = new PersonalInfo();
    ContactInfo contactInfo = new ContactInfo();
    Address address = new Address();
    List<Course> attendedCourses = new ArrayList<>();

    @Override
    public String toString() {
        return "Student: " + studentPersonalInfo.firstName + " " + studentPersonalInfo.lastName +
                ", Age: " + studentPersonalInfo.age +
                ", City: " + address.city +
                ", Email: " + contactInfo.email;
    }
}