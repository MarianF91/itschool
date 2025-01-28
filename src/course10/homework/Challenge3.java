package course10.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Challenge3 {

    public static void main(String[] args) {

        students();
    }

    public static void students (){

        Scanner scan = new Scanner(System.in);

        ArrayList<String> studentList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            System.out.println("Add a student to the list:");
            studentList.add(scan.nextLine());
        }

        ArrayList<String> graduateStudentList = new ArrayList<>(studentList);

        for (String student : graduateStudentList) {

            System.out.println("Graduate student: " + student);
        }
    }
}