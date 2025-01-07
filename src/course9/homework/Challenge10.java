package course9.homework;

import java.time.LocalDate;
import java.util.Scanner;

public class Challenge10 {

    public static void main(String[] args) {

        isValidDate();
    }

    public static void isValidDate() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a date in the format YYYY-MM-DD.");
        String inputDate = scan.nextLine();


        try {
            LocalDate date = LocalDate.parse(inputDate);
            System.out.println("The date " + date + " is valid.");


        } catch (Exception e) {
            System.out.println("Invalid date.");

        }
    }
}