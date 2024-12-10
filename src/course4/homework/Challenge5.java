package course4.homework;

import java.util.Scanner;

public class Challenge5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("This code checks if a number is positive or negative.");

        System.out.println("Introduce your number:");
        double number = scan.nextDouble();

        boolean trueValuePositive = (number > 0);
        boolean trueValueNegative = (number < 0);
        boolean trueValueZero = (number == 0);

        System.out.println("Your number is a positive number. " + trueValuePositive);
        System.out.println("Your number is a negative number. " + trueValueNegative);
        System.out.println("Your number is 0." + trueValueZero);
        }
    }