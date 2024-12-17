package course6.homework;

import java.util.Scanner;

public class Challenge15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("This program checks if the entered user and password.");
        System.out.println("For simplicity's sake, I've set the correct user to student, password to Java.");

        System.out.println("Enter your username:");
        String user = scan.nextLine();

        System.out.println("Enter your password:");
        String password = scan.nextLine();

        boolean hasUsername = "student".equals(user);
        boolean hasPassword = "Java".equals(password);

        if (hasUsername && hasPassword) {
            System.out.println("Authentication successful");
        } else {
            if (hasUsername) {
                System.out.println("Password is incorrect.");
            } else {
                System.out.println("Authentication failed.");
            }
        }
    }
}