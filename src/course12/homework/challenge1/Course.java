package course12.homework.challenge1;

import java.util.ArrayList;
import java.util.List;

public class Course {

    String hours;
    String description;
    String schedule;
    List<Teacher> attendingTeachers = new ArrayList<>();
    List<Student> attendingStudents = new ArrayList<>();

    @Override
    public String toString() {
        return "Course: " + description +
                "\nHours: " + hours +
                "\nSchedule: " + schedule +
                "\nTeacher: " + attendingTeachers +
                "\nAttending Students: " + attendingStudents + "\n";
    }
}