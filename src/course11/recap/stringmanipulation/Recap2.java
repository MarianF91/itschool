package course11.recap.stringmanipulation;

import java.util.Scanner;

public class Recap2 {

    public static void main(String[] args) {

        System.out.println("The concatenated version is: " + concatenatedStrings());

    }

    public static String concatenatedStrings() {

        String firstString;
        String secondString;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first string.");
        firstString = scan.nextLine();

        System.out.println("Enter the second string.");
        secondString = scan.nextLine();

        firstString = firstString + secondString;

        return firstString;
    }
}