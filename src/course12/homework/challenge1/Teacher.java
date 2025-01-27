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
        return "Teachers{" +
                "teacherInfo=" + teacherInfo +
                ", teachesCourses=" + teachesCourses +
                ", contactInfo=" + contactInfo +
                ", address=" + address +
                '}';
    }
}