package course10.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Challenge5 {

    public static void main(String[] args) {

        cities();
    }

    public static void cities() {

        Scanner scan = new Scanner(System.in);

        String[] originalList = {"Brasov", "Suceava", "Cluj-Napoca", "Pitesti", "Constanta"};

        System.out.println("This is the original list: " + Arrays.toString(originalList));

        ArrayList<String> cityNames = new ArrayList<>(Arrays.asList(originalList));

        while (true) {

            System.out.println("Add a city to the list.");

            String city = scan.nextLine();

            if (!cityNames.contains(city)) {

                cityNames.add(city);

                System.out.println("New city added to the list. Do you wish to add another one?");

                String answer = scan.nextLine();

                if (answer.equalsIgnoreCase("no")) {
                    System.out.println("Your new list is: " + cityNames);
                    break;

                } else if (!answer.equalsIgnoreCase("yes")) {
                    //If the user answers "yes", then the loop moves along on its own.
                    System.out.println("Invalid option.");
                }

            } else {
                System.out.println("The city is already in the list.");
            }
        }
    }
}