package recap.loops.and.flow.control;

import java.util.Scanner;

public class Recap5 {

    public static void main(String[] args) {

        sumOfDigits();

    }

    public static void sumOfDigits() {

        int number;
        int result = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number.");
        number = scan.nextInt();

        if (number < 0){

            number = -number;
        }

        do {

            result += number % 10;
            number /= 10;

        } while (number > 0);

        System.out.println("The sum of the digits is: " + result);
    }
}