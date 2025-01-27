package course12.homework.challenge1;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

    PersonalInfo teacherInfo = new PersonalInfo();
    List<Course> teachesCourses = new ArrayList<>();
    ContactInfo contactInfo = new ContactInfo();
    Address address = new Address();

    @Override
    public String toString() {
        return "Teacher: " + teacherInfo.firstName + " " + teacherInfo.lastName +
                ", Age: " + teacherInfo.age +
                ", City: " + address.city +
                ", Email: " + contactInfo.email;
    }
}