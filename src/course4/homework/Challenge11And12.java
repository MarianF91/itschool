package course4.homework;

import java.util.Scanner;

public class Challenge11And12 {

    public static void main(String[] args) {
        System.out.println("This code compares compares two input number and checks if they are withing a specific range");

        Scanner scan = new Scanner(System.in);

        System.out.println("Input the first number:");
        double firstNumber = scan.nextDouble();

        System.out.println("Input the second number:");
        double secondNumber = scan.nextDouble();

        boolean firstNumberCheck = (firstNumber >= 1 && firstNumber <=10); //checks if the number is within range (1-10) and returns 'true' or 'false';
        boolean secondNumberCheck = (secondNumber >10 && secondNumber <=100); //checks if the number is within range (11-100) and returns 'true' or 'false';
        boolean highFirstNumber = (firstNumber > secondNumber); //checks if the first number is higher than the second;
        boolean lowFirstNumber = (firstNumber < secondNumber); //checks if the first number is lower than the second;

        //normal challenge requests
        boolean normalRangeCheck1 = (firstNumber >= 1 && firstNumber <=10); //checks if the number is within range (1-10) and returns 'true' or 'false';
        boolean normalRangeCheck2 = (secondNumber > 10 && secondNumber <=100); //checks if the number is within range (11-100) and returns 'true' or 'false';
        boolean normalHighFirstNumber = (firstNumber > secondNumber); //checks if the first number is higher
        boolean normalHighSecondNumber = (firstNumber < secondNumber); //checks if the first number is lower
        boolean normalEqualNumber = (firstNumber == secondNumber); //checks if the numbers are equal

        System.out.println("Is the first number within range (1-10)? " + normalRangeCheck1);
        System.out.println("Is the second number within range (11-100)?" + normalRangeCheck2);
        System.out.println("Is the first number higher than the second number? " + normalHighFirstNumber);
        System.out.println("Is the second number higher that the first number? " + normalHighSecondNumber);
        System.out.println("Are the numbers equal? " + normalEqualNumber);

        //my addition
        if (firstNumberCheck) {
            System.out.println("Your first number is within range (1-10)."); //printed result if the first range condition is met;
        }
            else
            System.out.println("Your first number is outside range (1-10)."); //printed result if the second range condition is met;

        if (secondNumberCheck) {
            System.out.println("Your second number is within range (10-100)."); //printed result if the first comparison condition is met;
        }
        else
            System.out.println("Your first number is outside range (10-100)."); //printed result if the second comparison condition is met;

        if (highFirstNumber) {
            System.out.println(firstNumber + " is higher than " + secondNumber); //printed result if no comparison condition is met;
        }
        else if (lowFirstNumber) {
            System.out.println(firstNumber + " is lower than " + secondNumber);
        }
        else
            System.out.println("Your numbers are equal. " + firstNumber + " = " + secondNumber);
    }
}
