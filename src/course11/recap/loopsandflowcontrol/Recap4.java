package course11.recap.loopsandflowcontrol;

import java.util.Scanner;

public class Recap4 {

    public static void main(String[] args) {

        primeNumber();

    }

    static void primeNumber() {

        double number;
        double divisor = 2;
        int counter = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number.");
        number = scan.nextDouble();

        if (number < 2) {
            System.out.println("Numbers lower than 2 are not prime.");
        } else {
            while (divisor <= Math.sqrt(number)) {
                if (number % divisor == 0) {
                    counter++;
                }
                divisor++;
            }

            if (counter == 0) {
                System.out.println("Your number is prime.");

            } else {
                System.out.println("Your number is not prime");
            }
        }
    }
}