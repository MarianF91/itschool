package recap.java.basics;

import java.util.Scanner;

public class Recap1 {

    public static void main(String[] args) {

        integerOverflow();

    }

    public static void integerOverflow() {

        Scanner scan = new Scanner(System.in);
        int firstInt;
        int secondInt;

        System.out.println("Enter a high (but not too high) number without decimals.");
        firstInt = scan.nextInt();

        System.out.println("Enter another one.");
        secondInt = scan.nextInt();

        System.out.println("The result is: " + ((long) firstInt * secondInt));
    }
}