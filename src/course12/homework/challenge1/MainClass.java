package course12.homework.challenge1;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {

        System.out.println(studentInfo());
        System.out.println(teacherInfo());
        System.out.println(courseInfo());

    }

    public static List<Student> studentInfo(){

        List<Student> studentList = new ArrayList<>();

        Student student1 = new Student();

        //Personal Info
        PersonalInfo infoStudent1 = new PersonalInfo();
        infoStudent1.firstName = "Johnny";
        infoStudent1.lastName = "Bravo";
        infoStudent1.ssn = 123456789101L;
        infoStudent1.gender = "Male";
        infoStudent1.age = 21;
        infoStudent1.birthday = "14.02.2004";
        student1.studentInfo.add(infoStudent1);

        //Address
        Address student1Address = new Address();
        infoStudent1.homeAddress = new ArrayList<>();
        student1Address.country = "Texas";
        student1Address.county = "Dallas County";
        student1Address.city = "Aron City";
        student1Address.street = "Fake Street";
        student1Address.houseNumber = "123";
        infoStudent1.homeAddress.add(student1Address);

        //Contact Info
        ContactInfo student1ContactInfo = new ContactInfo();
        infoStudent1.contactInfo = new ArrayList<>();
        student1ContactInfo.phoneNumber = "555-1234";
        student1ContactInfo.email = "johnny.bravo@womenlove.me";
        infoStudent1.contactInfo.add(student1ContactInfo);

        Student student2 = new Student();

        //Personal Info
        PersonalInfo infoStudent2 = new PersonalInfo();
        infoStudent2.firstName = "Melissa";
        infoStudent2.lastName = "Lane";
        infoStudent2.ssn = 2345678910111L;
        infoStudent2.gender = "Female";
        infoStudent2.age = 21;
        infoStudent2.birthday = "14.01.2004";
        student2.studentInfo.add(infoStudent2);

        //Address
        Address student2Address = new Address();
        infoStudent2.homeAddress = new ArrayList<>();
        student2Address.country = "Texas";
        student2Address.county = "Dallas County";
        student2Address.city = "Aron City";
        student2Address.street = "Fake Boulevard";
        student2Address.houseNumber = "456";
        infoStudent2.homeAddress.add(student2Address);

        //Contact Info
        ContactInfo student2ContactInfo = new ContactInfo();
        infoStudent2.contactInfo = new ArrayList<>();
        student2ContactInfo.phoneNumber = "555-5678";
        student2ContactInfo.email = "melissa.lane@nojohnnyfor.me";
        infoStudent2.contactInfo.add(student2ContactInfo);

        //adding students to the list
        studentList.add(student1);
        studentList.add(student2);

        return studentList;
    }

    public static List<Teacher> teacherInfo(){

        List<Teacher> teacherList = new ArrayList<>();
        Teacher teacher1 = new Teacher();

        //Personal Info
        PersonalInfo infoTeacher1 = new PersonalInfo();
        infoTeacher1.firstName = "Momma";
        infoTeacher1.lastName = "Bravo";
        infoTeacher1.ssn = 2345678910111L;
        infoTeacher1.gender = "Female";
        infoTeacher1.age = 50;
        infoTeacher1.birthday = "14.02.1954";
        teacher1.teacherInfo.add(infoTeacher1);

        //Address
        Address teacher1Address = new Address();
        infoTeacher1.homeAddress = new ArrayList<>();
        teacher1Address.country = "Texas";
        teacher1Address.county = "Dallas County";
        teacher1Address.city = "Aron City";
        teacher1Address.street = "Big Momma Street";
        teacher1Address.houseNumber = "789";
        infoTeacher1.homeAddress.add(teacher1Address);

        //Contact Info
        ContactInfo teacher1ContactInfo = new ContactInfo();
        infoTeacher1.contactInfo = new ArrayList<>();
        teacher1ContactInfo.phoneNumber = "555-1011";
        teacher1ContactInfo.email = "momma.bravo@ibeatjohnny.com";
        infoTeacher1.contactInfo.add(teacher1ContactInfo);

        Teacher teacher2 = new Teacher();

        //Personal Info
        PersonalInfo infoTeacher2 = new PersonalInfo();
        infoTeacher2.firstName = "Carl";
        infoTeacher2.lastName = "Carlson";
        infoTeacher2.ssn = 1345678910111L;
        infoTeacher2.gender = "Male";
        infoTeacher2.age = 21;
        infoTeacher2.birthday = "14.01.2004";
        teacher2.teacherInfo.add(infoTeacher2);

        //Address
        Address teacher2Address = new Address();
        infoTeacher2.homeAddress = new ArrayList<>();
        teacher2Address.country = "Texas";
        teacher2Address.county = "Dallas County";
        teacher2Address.city = "Aron City";
        teacher2Address.street = "Carlesque Street";
        teacher2Address.houseNumber = "1011";
        infoTeacher2.homeAddress.add(teacher2Address);

        //Contact Info
        ContactInfo teacher2ContactInfo = new ContactInfo();
        infoTeacher2.contactInfo = new ArrayList<>();
        teacher2ContactInfo.phoneNumber = "555-1213";
        teacher2ContactInfo.email = "Carl.Carlson@friendofjohnnyis.me";
        infoTeacher2.contactInfo.add(teacher2ContactInfo);

        //adding teachers to the list
        teacherList.add(teacher1);
        teacherList.add(teacher2);

        return teacherList;
    }

    public static List<Course> courseInfo(){

        List<Course> courseList = new ArrayList<>();

        // Create the first course
        Course course1 = new Course();
        course1.description = "Biology";
        course1.hours = "2 hours";
        course1.schedule = "Monday at 8:00";

        // Get teachers and students for the first course
        List<Teacher> teachersForCourse1 = teacherInfo();
        course1.attendingTeacher.add(teachersForCourse1.getFirst()); // Add the first teacher

        List<Student> studentsForCourse1 = studentInfo();
        course1.attendingStudents.add(studentsForCourse1.get(0)); // Add the first student
        course1.attendingStudents.add(studentsForCourse1.get(1)); // Add the second student

        courseList.add(course1);

        // Create the second course
        Course course2 = new Course();
        course2.description = "English";
        course2.hours = "2 hours";
        course2.schedule = "Friday at 10:00";

        // Get teachers and students for the second course
        List<Teacher> teachersForCourse2 = teacherInfo();
        course2.attendingTeacher.add(teachersForCourse2.get(1)); // Add the second teacher

        List<Student> studentsForCourse2 = studentInfo();
        course2.attendingStudents.add(studentsForCourse2.get(0)); // Add the first student
        course2.attendingStudents.add(studentsForCourse2.get(1)); // Add the second student

        courseList.add(course2);

        return courseList;
    }
}