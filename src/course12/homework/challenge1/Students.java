package course12.homework.challenge1;

import java.util.ArrayList;
import java.util.List;

class Students {

    PersonalInfo studentInfo = new PersonalInfo();
    List<String> attendedCourses = new ArrayList<>();

    @Override
    public String toString() {
        return "Students{" +
                "studentInfo=" + studentInfo +
                ", attendedCourses=" + attendedCourses +
                ", contactInfo=" + contactInfo +
                ", address=" + address +
                '}';
    }

    ContactInfo contactInfo = new ContactInfo();
    Address address = new Address();
}