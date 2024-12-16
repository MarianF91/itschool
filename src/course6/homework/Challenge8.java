package course6.homework;

import java.util.Scanner;

public class Challenge8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("The factorial of a number");
        System.out.println("Enter a positive number (without commas):");
        int number = scan.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input.");
            System.exit(1);
        }

        int factorial = number; //variable to give factorial the original value of our number in order to start the correct math;
        int originalNumber = number; //variable to save the original value of our number for later use;

        //the following loop checks if our number is higher than one, then, if the condition is met, multiplies the original value of the variable
        //factorial with (number-1), overwrites it, afther which, number goes down by 1 and the process is repeated until number = 1, while factorial
        //gets multiplied with number-1 and gets his older values overwritten by the new ones.
        while (number > 1){
            factorial = factorial * (number-1);
            number--;
        }
        System.out.println("The factorial of the number " + originalNumber + " is " + factorial + ".");
    }
}
