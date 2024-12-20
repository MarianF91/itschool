package course7.homework;

import java.util.Scanner;

public class Challenge1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insert a number (without any decimals):");
        int number = scan.nextInt();

        if (number % 2 == 0) {
            System.out.println("Your number is even.");
        } else {
            System.out.println("Your number is odd.");
        }
    }
}