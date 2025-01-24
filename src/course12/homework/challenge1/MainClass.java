package course12.homework.challenge1;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    static String course1 = "Math";
    static String course2 = "Computer Science";
    static String course3 = "Physics";
    static String course4 = "Chemistry";
    static String course5 = "Biology";
    static String course6 = "Geography";
    static String course7 = "English";
    static String course8 = "History";

    public static void main(String[] args) {

        List<Teachers> listOfTeachers = teachers();
        List<Students> listOfStudents = students();

        List<Course> listOfCourses = courses(listOfTeachers.get(0), listOfTeachers.get(1), listOfTeachers.get(2), listOfTeachers.get(3),
                listOfStudents.get(0), listOfStudents.get(1), listOfStudents.get(2), listOfStudents.get(3));

        //The output... in a horrible way.
        System.out.println(listOfStudents);
        System.out.println(listOfTeachers);
        System.out.println(listOfCourses);

    }

    static List<Students> students() {

        List<Students> students = new ArrayList<>();

        Students student1 = new Students();
        student1.studentInfo.firstName = "Math And Computer Science";
        student1.studentInfo.lastName = "Student";
        student1.studentInfo.age = 10;
        student1.studentInfo.birthday = "01.01";
        student1.studentInfo.sex = "studious";
        student1.studentInfo.ssn = 1010101010101L;
        student1.contactInfo.email = "mestudy@ilketolearn.com";
        student1.contactInfo.phoneNumber = "0123456789";
        student1.address.city = "Math And Computer Science City";
        student1.address.street = "Me studying how to be smart.";
        student1.address.county = "MaCS";
        student1.address.houseNumber = "01";
        student1.attendedCourses.add(course1);
        student1.attendedCourses.add(course2);
        students.add(student1);

        Students student2 = new Students();
        student2.studentInfo.firstName = "Physics And Chemistry";
        student2.studentInfo.lastName = "Student";
        student2.studentInfo.age = 10;
        student2.studentInfo.birthday = "01.01";
        student2.studentInfo.sex = "studious";
        student2.studentInfo.ssn = 1010101010101L;
        student2.contactInfo.email = "mestudy@ilketolearn.com";
        student2.contactInfo.phoneNumber = "0123456789";
        student2.address.city = "Physics And Chemistry City";
        student2.address.street = "Me study how to experiment on things.";
        student2.address.county = "PaC";
        student2.address.houseNumber = "01";
        student2.attendedCourses.add(course3);
        student2.attendedCourses.add(course4);
        students.add(student2);

        Students student3 = new Students();
        student3.studentInfo.firstName = "Biology And Geography";
        student3.studentInfo.lastName = "Student";
        student3.studentInfo.age = 10;
        student3.studentInfo.birthday = "01.01";
        student3.studentInfo.sex = "studious";
        student3.studentInfo.ssn = 1010101010101L;
        student3.contactInfo.email = "mestudy@ilketolearn.com";
        student3.contactInfo.phoneNumber = "0123456789";
        student3.address.city = "Biology And Geography City";
        student3.address.street = "Me studying how to study things and places.";
        student3.address.county = "BaG";
        student3.address.houseNumber = "01";
        student3.attendedCourses.add(course5);
        student3.attendedCourses.add(course6);
        students.add(student3);

        Students student4 = new Students();
        student4.studentInfo.firstName = "English And History";
        student4.studentInfo.lastName = "Student";
        student4.studentInfo.age = 10;
        student4.studentInfo.birthday = "01.01";
        student4.studentInfo.sex = "studious";
        student4.studentInfo.ssn = 1010101010101L;
        student4.contactInfo.email = "mestudy@ilketolearn.com";
        student4.contactInfo.phoneNumber = "0123456789";
        student4.address.city = "English And History City";
        student4.address.street = "Me studying how to be smart.";
        student4.address.county = "EaH";
        student4.address.houseNumber = "01";
        student4.attendedCourses.add(course7);
        student4.attendedCourses.add(course8);
        students.add(student4);

        return students;
    }

     static List<Teachers> teachers() {

        List<Teachers> teachers = new ArrayList<>();

        Teachers teacher1 = new Teachers();
        teacher1.teacherInfo.firstName = "Math And Computer Science";
        teacher1.teacherInfo.lastName = "Teacher";
        teacher1.teacherInfo.age = 101;
        teacher1.teacherInfo.birthday = "01.01";
        teacher1.teacherInfo.sex = "calculated correctly";
        teacher1.teacherInfo.ssn = 1010101010101L;
        teacher1.contactInfo.email = "mathandcomputerscience@meageek.com";
        teacher1.contactInfo.phoneNumber = "0123456789";
        teacher1.address.city = "Math And Computer Science City";
        teacher1.address.street = "Me smart, me very smart.";
        teacher1.address.county = "MaCS";
        teacher1.address.houseNumber = "0101";
        teacher1.teachesCourses.add(course1);
        teacher1.teachesCourses.add(course2);
        teachers.add(teacher1);

        Teachers teacher2 = new Teachers();
        teacher2.teacherInfo.firstName = "Physics And Chemistry";
        teacher2.teacherInfo.lastName = "Teacher";
        teacher2.teacherInfo.age = 126;
        teacher2.teacherInfo.birthday = "31.12";
        teacher2.teacherInfo.sex = "scientifically approved";
        teacher2.teacherInfo.ssn = 1234567890123L;
        teacher2.contactInfo.email = "physicsandchemistry@meascientist.com";
        teacher2.contactInfo.phoneNumber = "0123456789";
        teacher2.address.city = "Physics And Chemistry City";
        teacher2.address.street = "Me like to experiment things, me very smart.";
        teacher2.address.county = "PaC";
        teacher2.address.houseNumber = "1889";
        teacher2.teachesCourses.add(course3);
        teacher2.teachesCourses.add(course4);
        teachers.add(teacher2);

        Teachers teacher3 = new Teachers();
        teacher3.teacherInfo.firstName = "Biology And Geography";
        teacher3.teacherInfo.lastName = "Teacher";
        teacher3.teacherInfo.age = 125;
        teacher3.teacherInfo.birthday = "01.01";
        teacher3.teacherInfo.sex = "biologically correct in the right geographic way";
        teacher3.teacherInfo.ssn = 1234567890123L;
        teacher3.contactInfo.email = "biologyandgeography@meanotherscientist.com";
        teacher3.contactInfo.phoneNumber = "0123456789";
        teacher3.address.city = "Biology And Geography City";
        teacher3.address.street = "Me like to study things and places, me very smart.";
        teacher3.address.county = "BaG";
        teacher3.address.houseNumber = "1900";
        teacher3.teachesCourses.add(course5);
        teacher3.teachesCourses.add(course6);
        teachers.add(teacher3);

        Teachers teacher4 = new Teachers();
        teacher4.teacherInfo.firstName = "English And History";
        teacher4.teacherInfo.lastName = "Teacher";
        teacher4.teacherInfo.age = 120;
        teacher4.teacherInfo.birthday = "31.12";
        teacher4.teacherInfo.sex = "historically accurate from an english point of view";
        teacher4.teacherInfo.ssn = 1234567890123L;
        teacher4.contactInfo.email = "englishandhistory@melikesbooks.com";
        teacher4.contactInfo.phoneNumber = "0123456789";
        teacher4.address.city = "English And History City";
        teacher4.address.street = "Me like to read a lot, me very smart.";
        teacher4.address.county = "EaH";
        teacher4.address.houseNumber = "1901";
        teacher4.teachesCourses.add(course7);
        teacher4.teachesCourses.add(course8);
        teachers.add(teacher4);

        return teachers;
    }

    public static List<Course> courses(Teachers teacher1,
                        Teachers teacher2,
                        Teachers teacher3,
                        Teachers teacher4,
                        Students student1,
                        Students student2,
                        Students student3,
                        Students student4) {

        List<Course> courses = new ArrayList<>();
        Course course1 = new Course();
        course1.hours = "2 hours";
        course1.description = "Math";
        course1.schedule = "Monday at 14:00";
        course1.taughtBy = teacher1;
        course1.attendingStudents.add(student1);
        courses.add(course1);

        Course course2 = new Course();
        course2.hours = "2 hours";
        course2.description = "Computer Science";
        course2.schedule = "Monday at 16:00";
        course2.taughtBy = teacher1;
        course2.attendingStudents.add(student1);
        courses.add(course2);

        Course course3 = new Course();
        course3.hours = "2 hours";
        course3.description = "Physics";
        course3.schedule = "Tuesday at 13:00";
        course3.taughtBy = teacher2;
        course3.attendingStudents.add(student2);
        courses.add(course3);

        Course course4 = new Course();
        course4.hours = "2 hours";
        course4.description = "Chemistry";
        course4.schedule = "Tuesday at 15:00";
        course4.taughtBy = teacher2;
        course4.attendingStudents.add(student2);
        courses.add(course4);

        Course course5 = new Course();
        course5.hours = "2 hours";
        course5.description = "Biology";
        course5.schedule = "Wednesday at 12:00";
        course5.taughtBy = teacher3;
        course5.attendingStudents.add(student3);
        courses.add(course5);

        Course course6 = new Course();
        course6.hours = "2 hours";
        course6.description = "Geography";
        course6.schedule = "Wednesday at 14:00";
        course6.taughtBy = teacher3;
        course6.attendingStudents.add(student3);
        courses.add(course6);

        Course course7 = new Course();
        course7.hours = "2 hours";
        course7.description = "English";
        course7.schedule = "Thursday at 08:00";
        course7.taughtBy = teacher4;
        course7.attendingStudents.add(student4);
        courses.add(course7);

        Course course8= new Course();
        course8.hours = "2 hours";
        course8.description = "History";
        course8.schedule = "Thursday at 10:00";
        course8.taughtBy = teacher4;
        course8.attendingStudents.add(student4);
        courses.add(course8);

        return  courses;
    }
}