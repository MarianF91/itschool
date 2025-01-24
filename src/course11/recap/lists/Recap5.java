package course11.recap.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Recap5 {

    public static void main(String[] args) {

        System.out.println("The final list is: " + listRemoval());

    }

    public static ArrayList<Integer> listRemoval() {

        int[] numbers = {1, 10, 2, 3, 5, 100, 19, 2500, 17, 9};
        ArrayList<Integer> intList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int choice;
        String answer;

        for (int number : numbers) {
            intList.add(number);
        }

        System.out.println("The original list is: " + intList);


        do {
            System.out.println("Enter an element to be removed.");
            choice = scan.nextInt();
            scan.nextLine();

            if (intList.contains(choice)) {

                System.out.println("The number " + choice + " has been removed from the list.");
                intList.remove(Integer.valueOf(choice));
            } else {
                System.out.println("Enter a valid choice.");
            }

            System.out.println("Do you wish to remove another number? Type <Yes> or <No>.");

            answer = scan.nextLine();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.out.println("Invalid input. Please enter <Yes> or <No>.");
                answer = scan.nextLine();
            }

        } while (answer.equalsIgnoreCase("yes"));

        return intList;
    }
}