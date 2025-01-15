package course8.homework;

import java.util.Scanner;

public class Challenge11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a camel case string (ex:FirstWordSecondWord).");

        StringBuilder originalString = new StringBuilder(scan.nextLine());

        System.out.println("Your string is: " + originalString);

        StringBuilder conversionToSnakeCase = new StringBuilder();


        for (int i = 0; i < originalString.length(); i++) {

            char currentLetter = originalString.charAt(i); //checks all the characters from originalString;

            if (Character.isUpperCase(currentLetter)) { //checks if the current character is upper case;

                if (!conversionToSnakeCase.isEmpty()) { //checks if it's the first letter;
                    conversionToSnakeCase.append('_'); //adds underscore if our letter it's not the first one;
                }
                conversionToSnakeCase.append(Character.toLowerCase(currentLetter)); //converts the letter to lower case and adds it to the string;
            } else {
                conversionToSnakeCase.append((currentLetter)); //adds the current letter if it's already lower case;
            }
                   }
        System.out.println(conversionToSnakeCase); //prints the result.
    }
}