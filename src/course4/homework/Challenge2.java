package course4.homework;

import java.util.Scanner;

public class Challenge2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("This code calculates the area of a rectangle in cm.\n" + "Let's start by introducing the length (cm):");
        double length = scan.nextDouble();

        System.out.println("And now the width (cm): ");
        double width = scan.nextDouble();

        double area = length * width;

        System.out.println("So, if the rectangle is " + length + " cm long and " + width + " cm wide, then it's area is " +
                area + " square centimeters.");
    }
}