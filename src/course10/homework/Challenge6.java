package course10.homework;

import java.util.LinkedList;
import java.util.Scanner;

public class Challenge6 {

    public static void main(String[] args) {

        studentList();
    }

    public static void studentList() {

        Scanner scan = new Scanner(System.in);
        String name;
        String answer;
        LinkedList<String> studentsList = new LinkedList<>();

        studentsList.add("Daniel");
        studentsList.add("Dana");
        studentsList.add("Rares");
        studentsList.add("Ramona");
        studentsList.add("Mihai");
        studentsList.add("Mihaela");
        studentsList.add("Andrei");
        studentsList.add("Andreea");

        System.out.println("This is the original students list: " + studentsList + ".\nType a name to be removed from the list.");

        while (true) {
            name = scan.nextLine();

            if (studentsList.contains(name)) {
                System.out.println(name + " has been removed from the list.");
                studentsList.remove(name);

            } else {
                System.out.println("This name is not on the list. Please add a valid name.");
            }

            System.out.println("Do you wish to remove another name from the list? Type <<Yes>> or <<No>>");
            answer = scan.nextLine();

            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Add another name to be removed from the list.");

            } else if (answer.equalsIgnoreCase("no")) {
                break;

            } else {
                System.out.println("Please enter a valid option.");

            }
        }
        System.out.println("Your new list is: " + studentsList);
    }
}