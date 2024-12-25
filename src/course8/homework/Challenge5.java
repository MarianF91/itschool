package course8.homework;

import java.util.Scanner;

public class Challenge5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word, a phrase or anything in between and watch the magic happen.");

        StringBuilder originalString = new StringBuilder(scan.nextLine());

        System.out.println("Your string is: " + originalString);

        StringBuilder capitalizedFirstLetter = new StringBuilder();

        boolean isFirstLetter = true;

        for (int i = 0; i < originalString.length(); i++) {

            char lettersOriginalString = originalString.charAt(i); //checks all the characters from originalString;

            if (isFirstLetter && Character.isLetter(lettersOriginalString)){ //checks if the current character is the first letter;
                lettersOriginalString = Character.toUpperCase(lettersOriginalString); //converts the letter to upper case;
                isFirstLetter = false; //sets the validation condition to false in order to restrain from capitalizing the next letter as well;
            }

            capitalizedFirstLetter.append(lettersOriginalString);//the current character (capitalized or not) is added to capitalizedFirstLetter;

            if (lettersOriginalString == ' '){ //checks if the current character is space;
                isFirstLetter = true; //sets the validation condition to true in order to validate the next letter;
            }
        }
        System.out.println(capitalizedFirstLetter); //prints the result.
    }
}