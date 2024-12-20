package course7.homework;

import java.util.Scanner;

public class Challenge11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double sum = 0;
        double average = 0;
        System.out.println("We will now calculate an average of several numbers. How many? That's up to you. I'll stop calculating when you enter 0.");

        do {
            System.out.println("Input a number:");
            double number = scan.nextDouble();

            if (number == 0) {
                if (average > 0) {
                    System.out.println("The average is: " + (sum / average) + ". To be more specific, your initial sum of " + sum + " has been divided " +
                            " total of " + average + ", this being the total of numbers that you put in.");
                } else {
                    System.out.println("You cannot divide by 0.");
                }
                break;
            }
            sum += number;
            average++;

        } while (true);
    }
}