package course11.recap.javabasics;

import java.util.Scanner;

public class Recap2 {

    public static void main(String[] args) {

    divisionByZero();

    }

    public static void divisionByZero (){

        Scanner scan = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int division;
        int modulo;

        System.out.println("Enter a number (without decimals) to be divided by another");

        firstNumber = scan.nextInt();

        System.out.println("Enter a number (also without decimals) to divide the first one.");
        secondNumber = scan.nextInt();

        try{
            division = firstNumber / secondNumber;
            modulo = firstNumber % secondNumber;

            System.out.println(firstNumber + " / " + secondNumber + " is " + division);
            System.out.println(firstNumber + " % " + secondNumber + " is " + modulo);
        } catch (ArithmeticException e){
            System.out.println("Cannot dvide by zero: " + e);
        }
    }
}