package course12.homework.challenge1;

import java.util.ArrayList;
import java.util.List;

public class Student {

    List<PersonalInfo> studentInfo;

    public Student() {
        studentInfo = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentInfo=" + studentInfo +
                '}';
    }
}