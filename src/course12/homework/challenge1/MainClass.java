package course12.homework.challenge1;

import java.time.Duration;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {

        Teachers teacher = new Teachers();
        Students student = new Students();
        Course course = new Course();

    }

    public static void students(Students student,
                                List<PersonalInfo> studentInfo,
                                List<Course> attendedCourses,
                                List<ContactInfo> studentContactInfo,
                                List<Address> address) {

        // to be continued
    }

    public static void teachers(Teachers teacher,
                                List<PersonalInfo> teacherInfo,
                                List<Course> teachesCourses,
                                List<ContactInfo> teacherContactInfo,
                                List<Address> address) {

        // to be continued

    }

    public static void courses(Duration hours,
                               String description,
                               String schedule,
                               List<Students> attendingStudents){

        // to be continued
    }

}