package course12and13.homework.challenge2;

import java.util.ArrayList;
import java.util.List;

public class Student {

    String studentName;
    String studentID;
    List<String> assignments = new ArrayList<>();
    List<Double> grades = new ArrayList<>();

    public double gradesAverage () {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    @Override
    public String toString() {
        return "\nStudent Name: " + studentName +
                "\nStudent ID: " + studentID +
                "\nassignment: " + assignments +
                "\ngrades =" + grades +
                "\ngrades average: " + gradesAverage();
    }
}