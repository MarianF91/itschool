package course4.homework;

import java.util.Scanner;

public class Challenge8 {

    public static void main(String[] args) {

        System.out.println("This code takes a whole number, chosen by the user and increments and decrements it by 1");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a whole number:");
        int chosenNumber = scan.nextInt();

        ++chosenNumber; //the variable chosenNumber increases its value by 1 and keeps it for further use
        System.out.println("If the value increases by 1, we have: " + chosenNumber);

        --chosenNumber; //chosenNumber returns to its original value;
        --chosenNumber; //chosenNumber decreases by 1 and keeps the new value for further use
        System.out.println("If the value decreases by 1, we have: " + chosenNumber);
    }
}
