package course12.homework.challenge1;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {

        // create a few courses... we can use these courses for multiple students
        Course math = createCourse("2 hours", "Math", "Monday at 14:00");
        Course computerScience = createCourse("2 hours", "Computer Science", "Monday at 16:00");

        // create a few students...
        // let's first create the objects contained by a student

        // create student1 personal info
        PersonalInfo student1Info = createPersonaInfo("Math And Computer Science", "Student",
                "studious", 10, "01.01", 1010101010101L);

        // create student1 contact info
        ContactInfo student1ContactInfo = createContactInfo("mestudy@ilketolearn.com", "0123456789");

        // create student1 address
        Address student1Address = createAddress("Math And Computer Science City", "Me studying how to be smart.",
                "MaCS", "MaCoScia", "01");

        // create a list of courses for student1
        List<Course> student1Courses = createCoursesList(math, computerScience);

        // finally create the student1 with all the above info
        Student student1 = createStudent(student1Info, student1Courses, student1ContactInfo, student1Address);

        // create another student

        // create student2 personal info
        PersonalInfo student2Info = createPersonaInfo("Physics And Chemistry", "Student",
                "studious", 10, "01.01", 1010101010101L);

        // create student2 contact info
        ContactInfo student2ContactInfo = createContactInfo("mestudy@ilketolearn.com", "0123456789");

        // create student2 address
        Address student2Address = createAddress("Physics And Chemistry City", "Me study how to experiment on things.",
                "PaC", "PhyChea", "01");

        // create a list of courses for student2 - let's say only math this time
        List<Course> student2Courses = createCoursesList(math);

        // finally create the student2 with all the above info
        Student student2 = createStudent(student2Info, student2Courses, student2ContactInfo, student2Address);

        // let's create a teacher now
        PersonalInfo teacherInfo = createPersonaInfo("Math And Computer Science", "Teacher",
                "calculated correctly", 101, "01.01", 1010101010101L);

        ContactInfo teacherContactInfo = createContactInfo("mathandcomputerscience@meageek.co", "0123456789");

        Address teacherAddress = createAddress("Math And Computer Science City", "Me smart, me very smart.",
                "MaCS", "MaCoScia", "0101");
        // let's say this teacher can teach 2 courses
        List<Course> teacherCourses = createCoursesList(math, computerScience);

        // finally create the teacher object with the above info
        Teacher teacher = createTeacher(teacherInfo, teacherCourses, teacherContactInfo, teacherAddress);

        // now let's play with the objects
        // let's say I want to see the students learning "Computer Science" with the above teacher
        List<Student> students = new ArrayList<>(); // create a list with all students;
        students.add(student1);
        students.add(student2);

        String courseName = "Computer Science";
        List<Student> studentsLearningComputerScience = new ArrayList<>();
        boolean teacherTeachesComputerScience = false;
        for (Course taughtCourse : teacher.teachesCourses) {
            if (courseName.equals(taughtCourse.description)) {
                teacherTeachesComputerScience = true;
                for (Student student : students) {
                    for (Course attendedCourse : student.attendedCourses) {
                        if (courseName.equals(attendedCourse.description)) {
                            studentsLearningComputerScience.add(student);
                        }
                    }
                }
                break;
            }
        }

        if (teacherTeachesComputerScience) {
            System.out.println("Teacher " + teacher.teacherInfo.firstName + " can teach " + courseName + " to following students: ");
            System.out.println(studentsLearningComputerScience);
        } else {
            System.out.println("Teacher " + teacher.teacherInfo.firstName + " does not teach " + courseName);
        }
    }

    private static PersonalInfo createPersonaInfo(String firstName,
                                                  String lastName,
                                                  String sex,
                                                  int age,
                                                  String birthday,
                                                  long ssn) {
        PersonalInfo personalInfo = new PersonalInfo();
        personalInfo.firstName = firstName;
        personalInfo.lastName = lastName;
        personalInfo.age = age;
        personalInfo.birthday = birthday;
        personalInfo.sex = sex;
        personalInfo.ssn = ssn;

        return personalInfo;
    }

    private static ContactInfo createContactInfo(String email, String phoneNumber) {
        ContactInfo contactInfo = new ContactInfo();
        contactInfo.email = email;
        contactInfo.phoneNumber = phoneNumber;

        return contactInfo;
    }

    private static Student createStudent(PersonalInfo studentInfo,
                                         List<Course> attendedCourses,
                                         ContactInfo contactInfo,
                                         Address address) {
        Student student = new Student();
        student.studentInfo = studentInfo;
        student.contactInfo = contactInfo;
        student.address = address;
        student.attendedCourses = attendedCourses;

        return student;
    }

    private static Teacher createTeacher(PersonalInfo teacherInfo,
                                         List<Course> teachesCourses,
                                         ContactInfo contactInfo,
                                         Address address) {
        Teacher teacher = new Teacher();
        teacher.teacherInfo = teacherInfo;
        teacher.contactInfo = contactInfo;
        teacher.address = address;
        teacher.teachesCourses = teachesCourses;

        return teacher;
    }

    private static Address createAddress(String city,
                                         String street,
                                         String county,
                                         String country,
                                         String houseNumber) {
        Address address = new Address();
        address.city = city;
        address.street = street;
        address.county = county;
        address.country = country;
        address.houseNumber = houseNumber;

        return address;
    }

    private static List<Course> createCoursesList(Course... courses) {
        List<Course> coursesList = new ArrayList<>();
        for (Course course : courses) {
            coursesList.add(course);
        }

        return coursesList;
    }

    private static Course createCourse(String hours, String desc, String schedule) {
        Course course = new Course();
        course.hours = hours;
        course.description = desc;
        course.schedule = schedule;

        return course;
    }
}