package recap.java.basics;

import java.util.Scanner;

public class Recap7 {

    public static void main(String[] args) {

        int firstNumber;
        int secondNumber;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number without digits.");
        firstNumber = scan.nextInt();

        System.out.println("Enter another number without digits.");
        secondNumber = scan.nextInt();

        System.out.println("This is:\n- an addition: " + firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber) +
                "\n- a subtraction: " + firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber) +
                "\n- a multiplication: " + firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber) +
                "\n- a division (only the whole part of the division, without the rest: " + firstNumber + " / " + secondNumber
                + " = " + (firstNumber / secondNumber));
    }
}