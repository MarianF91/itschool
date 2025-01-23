package course11.recap.string.manipulation;

import java.util.Scanner;

public class Recap1 {

    public static void main(String[] args) {

        System.out.println("Your string has: " + stringLength() + " elements.");

    }

    public static int stringLength() {

        Scanner scan = new Scanner(System.in);
        String string;
        int i = 0;

        System.out.println("Enter a string.");
        string = scan.nextLine();

        char[] stringSize = string.toCharArray();

        for (char _ : stringSize){
            i++;
        }
        return i;
    }
}