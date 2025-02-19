package course11recap.loopsandflowcontrol;
import java.util.Scanner;

public class Recap3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("The factorial of a number");
        System.out.println("Enter a positive number:");
        int number = scan.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input.");
            System.exit(1);
        }

        int factorial = number;

        for (int i = 2; i <= number; i++) {
            factorial *= i - 1;
        }
        System.out.println("The factorial of the number " + number + " is " + factorial + ".");
    }
}