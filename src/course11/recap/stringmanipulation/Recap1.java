package course11.recap.stringmanipulation;

import java.util.Scanner;

public class Recap1 {

    public static void main(String[] args) {

        System.out.println("Your string has: " + stringLength() + " elements.");

    }

    public static int stringLength() {

        Scanner scan = new Scanner(System.in);
        int counter = 0;

        System.out.println("Enter a string.");
        String string = scan.nextLine();

        char[] stringSize = string.toCharArray();

        for (int i = 0; i < stringSize.length; i++){
            counter++;
        }
        return counter;
    }
}