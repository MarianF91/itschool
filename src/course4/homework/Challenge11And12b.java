package course4.homework;

import java.util.Scanner;

public class Challenge11And12b {

    public static void main(String[] args) {
        System.out.println("This code compares compares two input number and checks if they are withing a specific range");

        Scanner scan = new Scanner(System.in);

        System.out.println("Input the first number:");
        double firstNumber = scan.nextDouble();

        System.out.println("Input the second number:");
        double secondNumber = scan.nextDouble();

        //conditions checking for higher, lower, equal and range
        boolean isFirstNumberInRange = (firstNumber >= 1 && firstNumber <= 10); //checks if the number is within range (1-10) and returns 'true' or 'false';
        boolean isSecondNumberInRange = (secondNumber > 10 && secondNumber <= 100); //checks if the number is within range (11-100) and returns 'true' or 'false';
        boolean isFirstNumberHigher = (firstNumber > secondNumber); //checks if the first number is higher than the second;
        boolean isFirstNumberLower = (firstNumber < secondNumber); //checks if the first number is lower than the second;

        //printed messages
        if (isFirstNumberInRange) {
            System.out.println("Your first number is within range (1-10)."); //printed result if the first range condition is met;
        }  else {
            System.out.println("Your first number is outside range (1-10)."); //printed result if the second range condition is met;
        }
        if (isSecondNumberInRange) {
            System.out.println("Your second number is within range (10-100)."); //printed result if the first comparison condition is met;
        } else {
            System.out.println("Your first number is outside range (10-100)."); //printed result if the second comparison condition is met;
        }
        if (isFirstNumberHigher) {
            System.out.println(firstNumber + " is higher than " + secondNumber); //printed result if no comparison condition is met;
        } else if (isFirstNumberLower) {
            System.out.println(firstNumber + " is lower than " + secondNumber);
        } else {
            System.out.println("Your numbers are equal. " + firstNumber + " = " + secondNumber);
        }
    }
}
