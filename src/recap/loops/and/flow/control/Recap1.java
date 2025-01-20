package recap.loops.and.flow.control;

import java.util.Scanner;

public class Recap1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number.");
        double number = scan.nextDouble();

        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}
