package course8.homework;

import java.util.Scanner;

public class Challenge7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word, a phrase or anything in between and watch the magic happen.");

        StringBuilder originalString = new StringBuilder(scan.nextLine());

        System.out.println("Your string is: " + originalString);

        StringBuilder noDuplicates = new StringBuilder(); //new variable to save the string without duplicates.

        for (int i = 0; i < originalString.length(); i++) {
            char currentChar = originalString.charAt(i);

            if (noDuplicates.indexOf(String.valueOf(currentChar)) == -1){ //checks if the character is already in noDuplicates;
                noDuplicates.append(currentChar); //adds the new character to noDuplicates;
            }
        }
        System.out.println("Your string without any duplicates is: " + noDuplicates);
    }
}