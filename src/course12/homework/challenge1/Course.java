package course12.homework.challenge1;

import java.util.ArrayList;
import java.util.List;

public class Course {

    String hours;
    String description;
    String schedule;
    List<Student> hasStudents = new ArrayList<>();
    List<Teacher> taughtBy = new ArrayList<>();

    @Override
    public String toString() {
        return "Course: " + description +
                ", Hours: " + hours +
                ", Schedule: " + schedule;
    }
}