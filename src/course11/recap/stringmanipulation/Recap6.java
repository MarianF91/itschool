package course11.recap.stringmanipulation;

import java.util.Scanner;

public class Recap6 {

    public static void main(String[] args) {

        System.out.println(stringManipulation());

    }

    public static String stringManipulation() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a name:");
        String name = scan.nextLine();

        System.out.println("Enter an age:");
        int age = scan.nextInt();

        return String.format("%s is %d years old.", name, age);
    }
}