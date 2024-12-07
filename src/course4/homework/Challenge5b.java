package course4.homework;

import java.util.Scanner;

public class Challenge5b {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("This code checks if a number is positive or negative.");

        System.out.println("Introduce your number:");
        double number = scan.nextDouble();
        boolean trueValue = true;

        // next we have two "if" loops to verify if your number is higher, lower or equal to 0
        if (number != 0) { //this verifies if the number is different than 0;

            trueValue = (number > 0); //next step if the number is different than 0 (I choose higher out of habit;
                                      // it can also be lower;

            if (trueValue) { //next step if the number is higher than 0;
                System.out.println("Your number is a positive number.");
            }
            else //next step if the number is lower than 0;
                System.out.println("Your number is a negative number.");
        }
        else //next step if the number is equal to 0;
            System.out.println("Use a number higher or lower than 0.");
    }
}