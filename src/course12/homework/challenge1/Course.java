package course12.homework.challenge1;

import java.util.ArrayList;

public class Course {

    String hours;
    String description;
    String schedule;
    String isTaughtBy = String.valueOf(new ArrayList<>());
    String attendingStudents = String.valueOf(new ArrayList<>());

    @Override
    public String toString() {
        return "Course: " + description +
                "\nHours: " + hours +
                "\nSchedule: " + schedule +
                "\nTeacher: " + isTaughtBy +
                "\nAttending Students: " + attendingStudents + "\n";
    }
}