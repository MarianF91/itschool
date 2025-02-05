package course12and13.homework.challenge2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Student details: " + gradebook());
    }

    public static List<Student> gradebook() {
        Scanner scan = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();

        while (true) {
            System.out.println("Add a new student to the list.");
            Student student = new Student();

            System.out.println("What's the student's name?");
            student.studentName = scan.nextLine();

            System.out.println("What's the student's ID?");
            student.studentID = scan.nextLine();

            boolean addingAssignments = true;

            while (addingAssignments) {
                System.out.println("Give the student an assignment:");
                String assignment = scan.nextLine();
                student.assignments.add(assignment);

                System.out.println("Give the assignment a grade:");
                double grade = scan.nextDouble();

                while (grade > 10 || grade < 1) {
                    System.out.println("Invalid option. Choose a different grade.");
                    grade = scan.nextDouble();
                }
                student.grades.add(grade);
                scan.nextLine();

                String assignmentAnswer;
                do {
                    System.out.println("Do you want to give the student another assignment?");
                    assignmentAnswer = scan.nextLine();

                    if (assignmentAnswer.equalsIgnoreCase("no")) {
                        addingAssignments = false;
                    } else if (!assignmentAnswer.equalsIgnoreCase("yes")) {
                        System.out.println("Invalid option.");
                    }

                } while (!assignmentAnswer.equalsIgnoreCase("yes")
                        && !assignmentAnswer.equalsIgnoreCase("no"));
            }

            studentList.add(student);

            System.out.println("Do you wish to add another student to the list?");
            String studentAnswer = scan.nextLine();

            if (studentAnswer.equalsIgnoreCase("no")) {
                break;
            } else if (!studentAnswer.equalsIgnoreCase("yes")) {
                System.out.println("Invalid option.");
            }
        }
        return studentList;
    }
}