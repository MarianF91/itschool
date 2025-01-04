package course9.homework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Challenge3 {

    public static void main(String[] args) {

        createSpecificDate();
    }

    public static void createSpecificDate() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a date (ex. 27th January 2340).");

        String inputDate = scan.nextLine();
        DateTimeFormatter formatInputDate = DateTimeFormatter.ofPattern("dd['th']['nd']['rd'] MMMM yyyy");

        try {
            LocalDate date = LocalDate.parse(inputDate, formatInputDate);
            System.out.println("The result is: " + date);
        } catch (DateTimeParseException e) {
            System.out.println("Incorrect format.");
        }
    }
}