package course12.homework.challenge1;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

    List<PersonalInfo> teacherInfo;

    public Teacher() {
        teacherInfo = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherInfo=" + teacherInfo +
                '}';
    }
}