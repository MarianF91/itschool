package course11.recap.java.basics;

import java.util.Scanner;

public class Recap6 {

    public static void main(String[] args) {

        String string;
        int fullNumber;
        double digitNumber;
        boolean isTrueOrFalse;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string.");
        string = scan.nextLine();

        System.out.println("Enter a number without digits.");
        fullNumber = scan.nextInt();

        System.out.println("Enter a number with digits.");
        digitNumber = scan.nextDouble();

        System.out.println("Simply enter <<true>> or <<false>>.");
        isTrueOrFalse = scan.nextBoolean();

        System.out.println("These variables are:\n- a string: " + string + "\n- an int: " + fullNumber + "\n- a double: "
                + digitNumber + "\n- a boolean: " + isTrueOrFalse);
    }
}