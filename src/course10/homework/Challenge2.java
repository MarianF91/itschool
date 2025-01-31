package course10.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Challenge2 {

    public static void main(String[] args) {

        christmasWishlist();
    }

    public static void christmasWishlist() {

        Scanner scan = new Scanner(System.in);
        ArrayList<String> wishes = new ArrayList<>();

        System.out.println("Add your first Christmas wish to the list:");

        wishes.add(scan.nextLine());

        while (true) {

            System.out.println("Do you wish to add another wish to the list?");
            String answer = scan.nextLine();

            if (answer.equalsIgnoreCase("yes")) {

                System.out.println("Add another wish to the list");
                wishes.add(scan.nextLine());

            } else if (answer.equalsIgnoreCase("no")) {

                System.out.println("Your Christmas wishes are: " + wishes);
                break;

            } else {

                System.out.println("Invalid answer. Try again.");
            }
        }
    }
}