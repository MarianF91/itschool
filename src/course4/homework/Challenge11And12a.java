package course4.homework;

import java.util.Scanner;

public class Challenge11And12a {

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
        boolean normalEqualNumber = (firstNumber == secondNumber); //checks if the numbers are equal

        //printed messages for each condition
        System.out.println("Is the first number within range (1-10)? " + isFirstNumberInRange);
        System.out.println("Is the second number within range (11-100)?" + isSecondNumberInRange);
        System.out.println("Is the first number higher than the second number? " + isFirstNumberHigher);
        System.out.println("Is the second number higher that the first number? " + isFirstNumberLower);
        System.out.println("Are the numbers equal? " + normalEqualNumber);
    }
}