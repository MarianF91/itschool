package recap.string.manipulation;

import java.util.ArrayList;
import java.util.Scanner;

public class Recap7 {

    public static void main(String[] args) {

        System.out.println(wordsReversal());

    }

    public static String wordsReversal() {

        String input;
        String[] inputToWords;
        ArrayList<String> reversedInput = new ArrayList<>();
        StringBuilder reversedOutput = new StringBuilder();
        String outputMessage;
        Scanner scan = new Scanner(System.in);

        System.out.println("Type a sentence or a phrase.");
        input = scan.nextLine();

        inputToWords = input.split(" ");

        for (int i = inputToWords.length - 1; i >= 0; i--) {

            reversedInput.add(inputToWords[i]);

        }

        for (String word : reversedInput) {

            reversedOutput.append(word).append(" ");

        }

        outputMessage = "The reversed version is: " + reversedOutput;

        return outputMessage;
    }
}