package course8.homework;

import java.util.Scanner;

public class Challenge2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Give me a word and let's check to see if it's a palindrome.");

        StringBuilder originalWord = new StringBuilder(scan.nextLine());
        StringBuilder reversedWord = new StringBuilder(originalWord.reverse());

        System.out.println("Your word is: " + originalWord);
        System.out.println("It's reversed version is: " + reversedWord);

        if (originalWord.toString().equals(reversedWord.toString())){
            System.out.println("Your word is a palindrome.");
        } else {
            System.out.println("Your word is not a palindrome.");
        }
    }
}