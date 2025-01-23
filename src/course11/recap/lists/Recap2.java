package course11.recap.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Recap2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> intList = new ArrayList<>();

        System.out.println("Enter a number.");
        int number = scan.nextInt();
        intList.add(number);
        scan.nextLine();

        while (true) {
            System.out.println("Do you want to add another number? Type <<yes>> or <<no>>.");
            String answer = scan.nextLine();
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Your list is: " + intList);
                break;
            } else if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Add another number.");
                number = scan.nextInt();
                intList.add(number);
                scan.nextLine();
            } else {
                System.out.println("Enter a valid option.");
            }
        }
    }
}