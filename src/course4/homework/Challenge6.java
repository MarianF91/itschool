package course4.homework;

import java.util.Scanner;

public class Challenge6 {

    public static void main(String[] args) {

        System.out.println("This code takes two boolean inputs and prints the negated result.");

        Scanner scan = new Scanner(System.in);

        System.out.println("Input the first variable (true or false): ");
        boolean value1 = scan.nextBoolean();

        System.out.println("Input the second variable (true or false");
        boolean value2 = scan.nextBoolean();

        //the following line prints the negated results;
        System.out.println("The negated results are: \n" + "- for the first variable: " + (!value1) + "\n- for the second variable: " + (!value2));

        //the following line prints the actual results;
        System.out.println("The real results are: \n" + "- for the first variable: " + value1 + "\n- for the second variable: " + value2);
    }
}
