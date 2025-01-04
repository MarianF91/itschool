package course8.homework;

import java.util.Scanner;

public class Challenge16 {

    public static void main(String[] args) {

        System.out.println(interleaver());

    }

    public static String interleaver() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string.");
        StringBuilder firstString = new StringBuilder(scan.nextLine());

        System.out.println("Enter a second string.");
        StringBuilder secondString = new StringBuilder(scan.nextLine());

        System.out.println("Let's add them together and interleave their contents.");

        StringBuilder combinedContent = new StringBuilder();
        int shortestLength = Math.min(firstString.length(), secondString.length()); /*determines the minimum length in order to iterate until
                                                                                    the end of the shortest string*/
        for (int i = 0; i < shortestLength; i++) {
            //interleaves the characters from the strings;
            combinedContent.append(firstString.charAt(i));
            combinedContent.append(secondString.charAt(i));
        }

        for (int i = shortestLength; i < firstString.length(); i++) {
            //adds another char from the first string (if there are any left);
            combinedContent.append(firstString.charAt(i));
        }

        for (int i = shortestLength; i < secondString.length(); i++) {
            //adds another char from the second string (if there are any left);
            combinedContent.append(secondString.charAt(i));
        }
        //prints the result.
        return ("Your combined content is: " + combinedContent);
    }
}