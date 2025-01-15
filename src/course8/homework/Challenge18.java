package course8.homework;

import java.util.Scanner;

public class Challenge18 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string (ex:a1b2c3).");

        StringBuilder originalString = new StringBuilder(scan.nextLine());

        StringBuilder expansionString = new StringBuilder();


        for (int i = 0; i < originalString.length(); i++) {
            int charCounter = 0; //variable used to count the number of times a char was printed;
            var currentChar = originalString.charAt(i);

            if (Character.isLetter(currentChar)) { //checks if the current character is a letter and adds it to expansionString;
                expansionString.append(currentChar);

            } else if (Character.isDigit(currentChar)) { //checks if the current character is a number and gets it's numeric value for further use;
                charCounter = Character.getNumericValue(currentChar);
            }
            if (i > 0 && Character.isLetter(originalString.charAt(i - 1))) { //checks if the previous character was a letter;

                char previousChar = originalString.charAt(i - 1); //if the condition is met, the value is saved to previousChar;

                for (int j = 0; j < charCounter - 1; j++ ) { //this decides how many times the character is added to the string, based on the saved numeric value;

                    expansionString.append(previousChar);
                }
            }
        }
        System.out.println("Your result is: " + expansionString); //prints the result.
    }
}