package course11.recap.java.basics;

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

        int total = 0;

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);

            if (Character.isDigit(character)) {
                total = total * 10 + (character - '0');

            } else {
                System.out.println("Invalid input.");
                return 0;
            }
        }
        return total;
    }
}