package course10.homework;

import java.util.Scanner;

public class Challenge9 {

    public static void main(String[] args) {

        binary();

    }

    public static void binary(){

        Scanner scan = new Scanner(System.in);
        int binaryNumber;
        int decimalNumber;

        System.out.println("Enter a number in the binary format (e.g. 1011).");

        binaryNumber = scan.nextInt();
        decimalNumber = Integer.parseInt(String.valueOf(binaryNumber), 2);

        System.out.println("Your decimal number is: " + decimalNumber);
    }
}