package course4.homework;

import java.util.Scanner;

public class Challenge3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("This program increments and decrements a number.\n" + "Introduce a number:");
        double number = scan.nextDouble();
        System.out.println("Original number: " + number);

        double incrementedValue = ++number;
        System.out.println("Incremented value: " + incrementedValue);

        number = --number;

        double decrementedValue = --number;
        System.out.println("Decremented value: " + decrementedValue);
    }
}