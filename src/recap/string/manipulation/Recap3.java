package recap.string.manipulation;

import java.util.Scanner;

public class Recap3 {

    public static void main(String[] args) {

        System.out.println("The new string is: " + substringExtraction());

    }

    public static String substringExtraction() {

        String string;
        int startSubstring;
        int endSubstring;
        int i = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string.");
        string = scan.nextLine();

        char[] stringSize = string.toCharArray();

        for (char _ : stringSize) {
            i++;
        }

        System.out.println("Your string has " + i + " elements.");

        System.out.println("Enter the start and end of a substring to be extracted from it.");

        do {

            System.out.print("Start: ");
            startSubstring = scan.nextInt();

            System.out.print("End: ");
            endSubstring = scan.nextInt();

            if (startSubstring < 0 || endSubstring > string.length()) {
                System.out.println("Out of bounds. Enter the correct values.");
            }

        } while (startSubstring < 0 || endSubstring > string.length());

        string = string.substring(0, startSubstring) + string.substring(endSubstring);
        return string;
    }
}