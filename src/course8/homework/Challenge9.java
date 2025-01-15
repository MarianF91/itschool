package course8.homework;

import java.util.Scanner;

public class Challenge9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a random text or letter to see how many times you typed each character.");

        StringBuilder text = new StringBuilder(scanner.nextLine());

        System.out.println("Your text is: " + text);

        StringBuilder eachLetterInText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            if (eachLetterInText.indexOf(String.valueOf(currentChar)) == -1 && currentChar != ' ') { //check if the first apparition for the char;
                eachLetterInText.append(currentChar);

                int letterCounter = 0; //sets counter to 0 if the char has already been met;

                for (int j = 0; j < text.length(); j++){ //checks the text to see how many times the char has been met;
                    if(text.charAt(j) == currentChar){
                        letterCounter++; //whenever we find an iteration of our char, the counter goes up by one.
                    }
                }
                System.out.println("The character " + currentChar + " has appeared " + letterCounter + " times.");
            }
        }
    }
}