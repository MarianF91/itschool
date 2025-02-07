package course11recap.stringmanipulation;

import java.util.Scanner;

public class Recap5 {

    public static void main(String[] args) {

        System.out.println("The new string is: " + characterReplacement());

    }

    public static String characterReplacement() {

        String string;
        char charToBeReplaced;
        char replacementChar;
        String finalString;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string.");
        string = scan.nextLine();

        System.out.println("Enter a char to be replaced.");
        charToBeReplaced = scan.nextLine().charAt(0);

        while (charToBeReplaced == '\n') {
            System.out.println("Invalid input. Enter a character.");
            charToBeReplaced = scan.nextLine().charAt(0);
        }

        System.out.println("Enter a char to replace it with.");
        replacementChar = scan.nextLine().charAt(0);

        while (replacementChar == '\n') {
            System.out.println("Invalid input. Enter a character.");
            replacementChar = scan.nextLine().charAt(0);
        }

        finalString = string.replace(charToBeReplaced, replacementChar);

        return finalString;
    }
}