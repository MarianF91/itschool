package course12.homework.challenge1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

class Course {

    String hours;
    String description;
    String schedule;
    Teachers taughtBy;
    List<Students> attendingStudents = new ArrayList<>();

    void addStudent (Students student){

        attendingStudents.add(student);
    }

    @Override
    public String toString() {
        return "Course{" +
                "hours=" + hours +
                ", description='" + description + '\'' +
                ", schedule='" + schedule + '\'' +
                ", taughtBy=" + taughtBy +
                ", attendingStudents=" + attendingStudents +
                '}';
    }
}