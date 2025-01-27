package course12.homework.challenge1;

import java.util.ArrayList;
import java.util.List;

public class Student {

    PersonalInfo studentInfo = new PersonalInfo();
    List<Course> attendedCourses = new ArrayList<>();
    ContactInfo contactInfo = new ContactInfo();
    Address address = new Address();

    @Override
    public String toString() {
        return "Students{" +
                "studentInfo=" + studentInfo +
                ", attendedCourses=" + attendedCourses +
                ", contactInfo=" + contactInfo +
                ", address=" + address +
                '}';
    }
}