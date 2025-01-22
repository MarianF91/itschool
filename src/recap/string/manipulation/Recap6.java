package recap.string.manipulation;

import java.util.Scanner;

public class Recap6 {

    public static void main(String[] args) {

        System.out.println(stringManipulation());

    }

    public static String stringManipulation() {

        int age;
        String name;
        String message;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a name:");
        name = scan.nextLine();

        System.out.println("Enter an age:");
        age = scan.nextInt();

        message = String.format("%s is %d years old.", name, age);

        return message;
    }
}