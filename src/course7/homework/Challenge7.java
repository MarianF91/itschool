package course7.homework;

import java.util.Scanner;

public class Challenge7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Guess a number between 0 and 10.");

        double guess;

        do {
            System.out.println("Enter a number:");
            guess = scan.nextDouble();

            if (guess < 5) {
                System.out.println("Too low.");
            } else if (guess > 5) {
                System.out.println("Too high.");
            }
        } while (guess != 5);
        System.out.println("Correct!");
    }
}