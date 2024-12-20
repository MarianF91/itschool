package course7.homework;

import java.util.Scanner;

public class Challenge10 {

    public static void main(String[] args) {

        String hello = "Hello World!";

        Scanner scan = new Scanner(System.in);

        System.out.println("Please tell me your first name:");
        String firstName = scan.nextLine();

        System.out.println("Please tell me your last name:");
        String lastName = scan.nextLine();

        int input;

        do {
            System.out.println("What would you like to do? Choose from 1 to 3:\n1. See your name.\n2. Say <<Hello World!>>\n3. Exit");
            input = scan.nextInt();

            if (input == 1) {
                System.out.println(firstName + " " + lastName + "\n");
            } else if (input == 2) {
                System.out.println(hello + "\n");
            } else if (input == 3) {
                System.out.println("Bye bye!\n");
                break;
            } else {
                System.out.println("Invalid input!\n");
            }
        } while (true);
    }
}