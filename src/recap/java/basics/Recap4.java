package recap.java.basics;

import java.util.Scanner;

public class Recap4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        float firstNumber;
        float secondNumber;
        float thirdNumber;
        float divider = 0;

        System.out.println("Enter the first number.");
        firstNumber = scan.nextFloat();
        divider++;

        System.out.println("Enter the second number.");
        secondNumber = scan.nextFloat();
        divider++;

        System.out.println("Enter the third number.");
        thirdNumber = scan.nextFloat();
        divider++;

        System.out.println("The average is: " + ((firstNumber + secondNumber + thirdNumber) / divider));
    }
}