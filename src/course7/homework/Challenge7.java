package course7.homework;

import java.util.Scanner;

public class Challenge7 {

    static final double GUESSED_NUMBER = 5;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Guess a number between 0 and 10.");

        double guess;

        do {
            System.out.println("Enter a number:");
            guess = scan.nextDouble();

            if (guess < 0 || guess >10){
                System.out.println("Invalid input.");
                System.exit(1);
                break;
            }

            if (guess < GUESSED_NUMBER) {
                System.out.println("Too low.");
            } else if (guess > GUESSED_NUMBER) {
                System.out.println("Too high.");
            }
        } while (guess != GUESSED_NUMBER);
        System.out.println("Correct!");
    }
}