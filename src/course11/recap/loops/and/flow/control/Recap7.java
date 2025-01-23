package course11.recap.loops.and.flow.control;

import java.util.Scanner;

public class Recap7 {

    public static void main(String[] args) {

        System.out.println("This code returns the sum of even numbers (except 0).");
        System.out.println("The sum of all the even numbers is: " + evenNumbersSum());

    }

    public static double evenNumbersSum() {

        Scanner scan = new Scanner(System.in);
        double number;
        double sum = 0;

        while (true) {

            System.out.println("Enter a new number.");
            number = scan.nextDouble();

            if (number == 0) {
                break;
            }

            if (number % 2 != 0) {
                continue;
            }

            sum += number;

        }
        return sum;
    }
}