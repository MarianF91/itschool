package course11.recap.loopsandflowcontrol;

import java.util.Scanner;

public class Recap10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Give me a word and let's check to see if it's a palindrome.");

        String originalWord = scan.nextLine();
        String reversedWord ="";

        for (int i = originalWord.length() - 1; i >= 0; i--) {
            reversedWord += originalWord.charAt(i);
        }

        System.out.println("Your word is: " + originalWord);
        System.out.println("It's reversed version is: " + reversedWord);

        if (originalWord.equalsIgnoreCase(reversedWord)){
            System.out.println("Your word is a palindrome.");
        } else {
            System.out.println("Your word is not a palindrome.");
        }
    }
}