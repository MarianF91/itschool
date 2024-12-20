package course7.homework;

import java.util.Scanner;

public class Challenge12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Let's calculate a sum by being discriminative and take into account only the numbers higher than 5." +
                " Sorry for that, 5 and below! :(");

        double sum = 0;

        while (true) {

            System.out.println("Input a number: ");
            double number = scan.nextDouble();
            scan.nextLine();

            if (number <= 5) {
                System.out.println("This number is too low and will not be added to the total.");
                continue;
            }

            sum += number;

            while (true) {
                System.out.println("Do you want to stop? Type Yes or No.");

                String answer = scan.nextLine();

                if (answer.equalsIgnoreCase("Yes")) {
                    System.out.println("Your total is: " + sum);
                    return;
                } else if (answer.equalsIgnoreCase("No")) {
                    break;
                } else {
                    System.out.println("Invalid answer.");
                }
            }
        }
    }
}