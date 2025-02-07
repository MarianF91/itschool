package course11recap.loopsandflowcontrol;

import java.util.Scanner;

public class Recap6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double sum = 0;
        double number;
        
        System.out.println("This program will continue to add numbers to a total until you enter a negative number" +
                " and after that it will show you the sum of all positive numbers.");

        while (true) {

            System.out.println("Enter a new number:");
            number = scan.nextDouble();

            if (number < 0) {
                System.out.println("End of program.");
                break;
            }

            sum = sum + number;
        }
        System.out.println("Your final result is: " + sum);
    }
}