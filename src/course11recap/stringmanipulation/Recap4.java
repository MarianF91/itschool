package course11recap.stringmanipulation;

import java.util.Scanner;

public class Recap4 {

    public static void main(String[] args) {

        System.out.println(stringComparison());

    }

    public static String stringComparison(){

        String firstString;
        String secondString;
        String result;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string.");
        firstString = scan.nextLine();

        System.out.println("Enter another string.");
        secondString = scan.nextLine();

        /*due to challenge constraints, I had to use equals instead of equalsIgnoreCase,
         thus it will print the second result if the cases (upper case or lower case) don't match, regardless of anything else.*/
        if (firstString.equals(secondString)){
            result = "The strings are equal.";
        } else {
            result = "The strings are not equal.";
        }

        return result;
    }
}
