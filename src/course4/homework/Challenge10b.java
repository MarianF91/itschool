package course4.homework;

import java.util.Scanner;

public class Challenge10b {

    public static void main(String[] args) {

        System.out.println("This code calculates the price of a product after a discount.");

        Scanner scan = new Scanner(System.in);

        System.out.println("Type the price for your product (RON): ");
        double price = scan.nextDouble();

        System.out.println("Type your discount between 1 and 50 (in percentages): ");
        double discount = scan.nextDouble();

        price -= ((discount/100)*price);

        System.out.println("Your final price is: " + price);
    }
}