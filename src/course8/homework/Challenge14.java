package course8.homework;

import java.util.Scanner;

public class Challenge14 {

    public static void main(String[] args) {

        if (anagram()) {
            System.out.println("Your strings are anagrams.");
        } else {
            System.out.println("Your strings are not anagrams.");
        }

    }

    public static boolean anagram() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string.");
        StringBuilder firstString = new StringBuilder(scan.nextLine());

        System.out.println("Enter another string.");
        StringBuilder secondString = new StringBuilder(scan.nextLine());

        if (firstString.length() != secondString.length()) { //this checks if the 2 strings have the same number of letters;
            return false;
        }

        int[] letterCounter = new int[256]; //this initializes an array of 256 chars (assuming that we are using ASCII) to count the occurrence of each char;

        for (char letter : firstString.toString().toCharArray()) { //checks each char in the first string;
            letterCounter[letter]++; //increments for each char;
        }

        for (char letter : secondString.toString().toCharArray()) { //checks each char in the second string;
            letterCounter[letter]--; //decrements for each char;
        }

        for (int counter : letterCounter) { //checks if all the values in letterCounter are 0;
            if (counter != 0) {
                return false; //return false if it finds any value different from 0;
            }
        }
        return true; //default result if we didn't have any false results so far.
    }
}