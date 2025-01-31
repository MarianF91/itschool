package course11.recap.stringmanipulation;

import java.util.Scanner;

public class Recap1 {

    public static void main(String[] args) {

        System.out.println("Your string has: " + stringLength() + " elements.");

    }

    public static int stringLength() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string.");
        String string = scan.nextLine();

        char[] stringSize = string.toCharArray();

        return stringSize.length;
    }
}