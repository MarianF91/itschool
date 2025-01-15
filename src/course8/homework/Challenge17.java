package course8.homework;

import java.util.Scanner;

public class Challenge17 {

    public static void main(String[] args) {

        System.out.println(patternRecognition());
    }

    public static String patternRecognition() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string to see if it has any patterns.");

        StringBuilder stringToCheck = new StringBuilder(scan.nextLine());

        for (int i = 1; i <= stringToCheck.length() / 2; i++) { //iterates from 1 until it reaches the half of the string;

            for (int j = 0; j <= stringToCheck.length() - i * 2; j++) { //iterates from 0 up to a value which guarantees the extraction of 2 substrings;

                String patternOne = stringToCheck.substring(j, j + i); //gets the substrings from j to j+i;
                String patternTwo = stringToCheck.substring(j + i, j + i * 2); //gets the substrings from j+i to j+i*2;

                if (patternOne.equals(patternTwo)) {
                    return ("The pattern is: " + patternOne);
                }
            }
        }
        return ("There are no patters.");
    }
}