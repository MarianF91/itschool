package course8.homework;

import java.util.Scanner;

public class Challenge10 {

    public static void main(String[] args) {

        System.out.println("Let's see how Morse Code looks like!\n");

        textTransformation();
    }

     static void textTransformation (){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write something and let me do my magic!");

        StringBuilder textInput = new StringBuilder(scanner.nextLine());
        StringBuilder conversionToMorseCode = new StringBuilder();

        for (int i = 0; i < textInput.length(); i++){
            char currentLetter = textInput.charAt(i);

            switch (currentLetter){
                case 'a', 'A' -> conversionToMorseCode.append(".-");
                case 'b', 'B' -> conversionToMorseCode.append("-...");
                case 'c', 'C' -> conversionToMorseCode.append("-.-.");
                case 'd', 'D' -> conversionToMorseCode.append("-..");
                case 'e', 'E' -> conversionToMorseCode.append('.');
                case 'f', 'F' -> conversionToMorseCode.append("..-.");
                case 'g', 'G' -> conversionToMorseCode.append("--.");
                case 'h', 'H' -> conversionToMorseCode.append("....");
                case 'i', 'I' -> conversionToMorseCode.append("..");
                case 'j', 'J' -> conversionToMorseCode.append(".---");
                case 'k', 'K' -> conversionToMorseCode.append("-.-");
                case 'l', 'L' -> conversionToMorseCode.append(".-..");
                case 'm', 'M' -> conversionToMorseCode.append("--");
                case 'n', 'N' -> conversionToMorseCode.append("-.");
                case 'o', 'O' -> conversionToMorseCode.append("---");
                case 'p','P' -> conversionToMorseCode.append(".--.");
                case 'q', 'Q' -> conversionToMorseCode.append("--.-");
                case 'r', 'R' -> conversionToMorseCode.append(".-.");
                case 's', 'S' -> conversionToMorseCode.append("...");
                case 't', 'T' -> conversionToMorseCode.append('-');
                case 'u', 'U' -> conversionToMorseCode.append("..-");
                case 'v', 'V' -> conversionToMorseCode.append("...-");
                case 'w', 'W' -> conversionToMorseCode.append(".--");
                case 'x', 'X' -> conversionToMorseCode.append("-..-");
                case 'y', 'Y' -> conversionToMorseCode.append("-.--");
                case 'z', 'Z' -> conversionToMorseCode.append("--..");
                case '1' -> conversionToMorseCode.append(".----");
                case '2' -> conversionToMorseCode.append("..---");
                case '3' -> conversionToMorseCode.append("...--");
                case '4' -> conversionToMorseCode.append("....-");
                case '5' -> conversionToMorseCode.append(".....");
                case '6' -> conversionToMorseCode.append("-....");
                case '7' -> conversionToMorseCode.append("--...");
                case '8' -> conversionToMorseCode.append("---..");
                case '9' -> conversionToMorseCode.append("----.");
                case '0' -> conversionToMorseCode.append("-----");
            }
        }
         System.out.println("The morse code version of your text is: " + conversionToMorseCode);
    }
}