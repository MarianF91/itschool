package course7.homework;

import java.util.Scanner;

public class Challenge2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insert the month of your birth (between 1 and 12):");

        int month = scan.nextInt();

        if (month == 1) {
            System.out.println("You are born in January.");
        } else if (month == 2) {
            System.out.println("You are born in February.");
        } else if (month == 3) {
            System.out.println("You are born in March.");
        } else if (month == 4) {
            System.out.println("You are born in April.");
        } else if (month == 5) {
            System.out.println("You are born in May.");
        } else if (month == 6) {
            System.out.println("You are born in June.");
        } else if (month == 7) {
            System.out.println("You are born in July.");
        } else if (month == 8) {
            System.out.println("You are born in August.");
        } else if (month == 9) {
            System.out.println("You are born in September.");
        } else if (month == 10) {
            System.out.println("You are born in October.");
        } else if (month == 11) {
            System.out.println("You are born in November.");
        } else if (month == 12) {
            System.out.println("You are born in December.");
        } else {
            System.out.println("Invalid month.");
        }
    }
}