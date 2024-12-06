package course4.homework;

import java.util.Scanner;

public class Challenge5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("This code checks if a number is positive or negative.");

        System.out.println("Introduce your number:");
        double number = scan.nextDouble();

        boolean trueValue = (number > 0);

        if (trueValue == true) {
            System.out.println("Your number is a positive number.");

        } else

            System.out.println("Your number is a negative number.");
        }
    }