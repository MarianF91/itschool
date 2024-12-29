package course8.homework;

import java.util.Scanner;

public class Challenge15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string.");

        StringBuilder originalString = new StringBuilder(scan.nextLine());

        System.out.println("Your string is: " + originalString);

        StringBuilder conversionToggleCases = new StringBuilder();


        for (int i = 0; i < originalString.length(); i++) {

            char currentLetter = originalString.charAt(i); //checks all the characters from originalString;

            if (Character.isUpperCase(currentLetter)) { //checks if the current character is upper case or lower case;
                conversionToggleCases.append(Character.toLowerCase(currentLetter)); //if upper converts to lower and adds to string;
            } else {
                conversionToggleCases.append(Character.toUpperCase(currentLetter)); //if lower, converts to upper and adds to string;
            }
        }
        System.out.println(conversionToggleCases); //prints the result.
    }
}