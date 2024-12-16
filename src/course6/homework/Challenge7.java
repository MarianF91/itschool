package course6.homework;

import java.util.Scanner;

public class Challenge7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Determining the type of a triangle\n");

        System.out.println("Enter the first side:");
        double sideOne = scan.nextDouble();
        System.out.println("Enter the second side:");
        double sideTwo = scan.nextDouble();
        System.out.println("Enter the third side:");
        double sideThree = scan.nextDouble();

        if ((sideOne != sideTwo) && (sideTwo != sideThree) && (sideOne != sideThree)) {
            System.out.println("The triangle is Scalene.");
        } else if ((sideOne == sideTwo) && (sideTwo == sideThree )) {
            System.out.println("The triangle is Equilateral.");
        } else {
            System.out.println("The triangle is Isosceles.");
        }
    }
}