package course6.homework;

import java.util.Scanner;

public class Challenge3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insert your age: ");

        int age = scan.nextInt();

        if (age < 0) {
            System.out.println("Invalid input.");
        }

        String output = (age >= 18) ? "I am an adult." : "I am a child.";
        System.out.println(output);
    }
}