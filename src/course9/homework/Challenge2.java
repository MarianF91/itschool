package course9.homework;

import java.time.LocalDate;
import java.util.Scanner;

public class Challenge2 {

    public static void main(String[] args) {

        displayDateComponents();
    }

    public static void displayDateComponents() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a date in the following format: YYYY-MM-DD");

        String inputDate = scan.nextLine();

        LocalDate date = LocalDate.parse(inputDate);

        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();

        String monthFormat = String.format("%02d", month);

        System.out.println("Year: " + year + "\n" + "Month: " + monthFormat + "\n" + "Day: " + day);
    }
}