package course8.homework;

import java.util.Scanner;

public class Challenge4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word, a phrase or anything in between and watch the magic happen.");

        StringBuilder originalString = new StringBuilder(scan.nextLine());

        System.out.println("Your string is: " + originalString);

        String vowels ="aAeEiIoOuU";

        StringBuilder noVowels = new StringBuilder(); //new variable to save the string without vowels.

        for (int i = 0; i < originalString.length(); i++){
            char letterOriginalString = originalString.charAt(i); //returns each character from the string.
            if (vowels.indexOf(letterOriginalString) == -1){ //checks if the character is a vowel.
                noVowels.append(letterOriginalString); //saves all non-vowels to the new variable.
            }
        }
        System.out.println("Your string without vowels is: " + noVowels);
    }
}