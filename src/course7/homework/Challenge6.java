package course7.homework;

import java.util.Scanner;

public class Challenge6 {

    public static void main(String[] args) {

        System.out.println("This program will continue to add numbers to a total until you enter -1 and after that it will show you" +
                "the final result.");

        Scanner scan = new Scanner(System.in);

        double sum = 0;
        double number;
        while (true) {

            System.out.println("Enter a new number:");
            number = scan.nextDouble();

            if (number == -1) {
                System.out.println("End of program.");
                break;
            }

            sum = sum + number;
        }
        System.out.println("Your final result is: " + sum);
    }
}