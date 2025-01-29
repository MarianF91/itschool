package course12.homework.challenge1;

import java.util.ArrayList;
import java.util.List;

public class Course {

    String hours;
    String description;
    String schedule;
    List<Teacher> attendingTeacher = new ArrayList<>();
    List<Student> attendingStudents = new ArrayList<>();

    @Override
    public String toString() {
        return "Course: " + description +
                "\nHours: " + hours +
                "\nSchedule: " + schedule +
                "\nTeacher: " + attendingTeacher +
                "\nAttending Students: " + attendingStudents + "\n";
    }
}