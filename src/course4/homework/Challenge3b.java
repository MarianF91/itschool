package course4.homework;

import java.util.Scanner;

public class Challenge3b {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("This code returns the reversed value of a whole number.\n\n" + "Introduce a whole number:");

        int wholeNumber = scan.nextInt();
        int reversedValue = -wholeNumber;

        System.out.println("The reversed value of your number is: " + reversedValue);
    }
}