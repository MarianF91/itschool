package course11.recap.javabasics;

import java.util.Scanner;

public class Recap3 {

    public static void main(String[] args) {

        conversionStringToInteger();

    }

    public static void conversionStringToInteger() {

        Scanner scan = new Scanner(System.in);
        String input;
        int convertedToInt;

        System.out.println("Enter a string:");
        input = scan.nextLine();

        convertedToInt = values(input);

        System.out.println("The numeric value of your string is: " + convertedToInt);

    }

    public static int values(String input) {

        if (input.matches("\\d+")) { // Check if we have only digits
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.getMessage());
                return 0;
            }
        } else {
            System.out.println("Invalid input. String contains non-numerical characters.");
            return 0;
        }
    }
}