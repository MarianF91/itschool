package course12.homework.challenge1;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

       public static void main(String[] args) {

        List<Course> courses = course();
        List<Student> student = createStudents(courses);
        List<Teacher> teacher = createTeachers(courses);

        System.out.println("Students:");
        for (Student allStudents : student) {
            System.out.println(allStudents);
        }

        System.out.println("\nTeachers:");
        for (Teacher allTeachers : teacher) {
            System.out.println(allTeachers);
        }

        System.out.println("\nCourses:");
        for (Course allCourses :  courses){
            System.out.println(allCourses);
        }

    }

    static List<Student> createStudents(List<Course> courses) {
        List<Student> studentList = new ArrayList<>();

        String[][] studentData = {
                {"Math And Computer Science", "Student", "10", "01.01", "studious", "1010101010101", "mestudy@ilketolearn.com", "0123456789", "Math And Computer Science City", "Me studying how to be smart.", "MaCS", "MaCoScia", "01"},
                {"Physics And Chemistry", "Student", "10", "01.01", "studious", "1010101010101", "mestudy@ilketolearn.com", "0123456789", "Physics And Chemistry City", "Me study how to experiment on things.", "PaC", "PhyChea", "01"},
                {"Biology And Geography", "Student", "10", "01.01", "studious", "1010101010101", "mestudy@ilketolearn.com", "0123456789", "Biology And Geography City", "Me studying how to study things and places.", "BaG", "GeBia", "01"},
                {"English And History", "Student", "10", "01.01", "studious", "1010101010101", "mestudy@ilketolearn.com", "0123456789", "English And History City", "Me studying how to be smart.", "EaH", "HiEngia", "01"}
        };

        for (String[] data : studentData) {
            Student student = new Student();
            student.studentPersonalInfo.firstName = data[0];
            student.studentPersonalInfo.lastName = data[1];
            student.studentPersonalInfo.age = Integer.parseInt(data[2]);
            student.studentPersonalInfo.birthday = data[3];
            student.studentPersonalInfo.sex = data[4];
            student.studentPersonalInfo.ssn = Long.parseLong(data[5]);
            student.contactInfo.email = data[6];
            student.contactInfo.phoneNumber = data[7];
            student.address.city = data[8];
            student.address.street = data[9];
            student.address.county = data[10];
            student.address.country = data[11];
            student.address.houseNumber = data[12];

            for (Course course : courses) {
                student.attendedCourses.add(course);
                course.hasStudents.add(student);
            }
            studentList.add(student);
        }

        return studentList;
    }

    static List<Teacher> createTeachers(List<Course> courses) {
        List<Teacher> teacherList = new ArrayList<>();

        String[][] teacherData = {
                {"Math And Computer Science", "Teacher", "101", "01.01", "calculated correctly", "1010101010101", "mathandcomputerscience@meageek.com", "0123456789", "Math And Computer Science City", "Me smart, me very smart.", "MaCS", "MaCoScia", "0101"},
                {"Physics And Chemistry", "Teacher", "126", "31.12", "scientifically approved", "1234567890123", "physicsandchemistry@meascientist.com", "0123456789", "Physics And Chemistry City", "Me like to experiment things, me very smart.", "PaC", "PhyChea", "1889"},
                {"Biology And Geography", "Teacher", "125", "01.01", "biologically correct in the right geographic way", "1234567890123", "biologyandgeography@meanotherscientist.com", "0123456789", "Biology And Geography City", "Me like to study things and places, me very smart.", "BaG", "GeBia", "1900"},
                {"English And History", "Teacher", "120", "31.12", "historically accurate from an english point of view", "1234567890123", "englishandhistory@melikesbooks.com", "0123456789", "English And History City", "Me like to read a lot, me very smart.", "EaH", "HiEngia", "1901"}
        };

        for (String[] data : teacherData) {
            Teacher teacher = new Teacher();
            teacher.teacherInfo.firstName = data[0];
            teacher.teacherInfo.lastName = data[1];
            teacher.teacherInfo.age = Integer.parseInt(data[2]);
            teacher.teacherInfo.birthday = data[3];
            teacher.teacherInfo.sex = data[4];
            teacher.teacherInfo.ssn = Long.parseLong(data[5]);
            teacher.contactInfo.email = data[6];
            teacher.contactInfo.phoneNumber = data[7];
            teacher.address.city = data[8];
            teacher.address.street = data[9];
            teacher.address.county = data[10];
            teacher.address.country = data[11];
            teacher.address.houseNumber = data[12];

            for (Course course : courses) {
                teacher.teachesCourses.add(course);
                course.taughtBy.add(teacher);
            }
            teacherList.add(teacher);
        }

        return teacherList;
    }

    public static List<Course> course() {

        List<Course> courseList = new ArrayList<>();
        Course math = new Course();
        math.hours = "2 hours";
        math.description = "Math";
        math.schedule = "Monday at 14:00";
        courseList.add(math);

        Course computerscience = new Course();
        computerscience.hours = "2 hours";
        computerscience.description = "Computer Science";
        computerscience.schedule = "Monday at 16:00";
        courseList.add(computerscience);

        Course physics = new Course();
        physics.hours = "2 hours";
        physics.description = "Physics";
        physics.schedule = "Tuesday at 13:00";
        courseList.add(physics);

        Course chemistry = new Course();
        chemistry.hours = "2 hours";
        chemistry.description = "Chemistry";
        chemistry.schedule = "Tuesday at 15:00";
        courseList.add(chemistry);

        Course biology = new Course();
        biology.hours = "2 hours";
        biology.description = "Biology";
        biology.schedule = "Wednesday at 12:00";
        courseList.add(biology);

        Course geography = new Course();
        geography.hours = "2 hours";
        geography.description = "Geography";
        geography.schedule = "Wednesday at 14:00";
        courseList.add(geography);

        Course english = new Course();
        english.hours = "2 hours";
        english.description = "English";
        english.schedule = "Thursday at 08:00";
        courseList.add(english);

        Course history = new Course();
        history.hours = "2 hours";
        history.description = "History";
        history.schedule = "Thursday at 10:00";
        courseList.add(history);

        return courseList;
    }
}