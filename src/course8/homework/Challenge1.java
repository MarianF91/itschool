package course8.homework;

import java.util.Scanner;

public class Challenge1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Give me any word, phrase or anything in between and I'll show it in reverse.");

        StringBuilder initialString = new StringBuilder(scan.nextLine());

        System.out.println("The reversed version of what you typed is: " + initialString.reverse());
    }
}