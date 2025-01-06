package course9.homework;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Challenge9 {

    public static void main(String[] args) {

        daysBetween();
    }

    public static void daysBetween() {

        Scanner scan = new Scanner(System.in);

        System.out.println("We'll now check how many days are between two dates.\n");

        System.out.println("Enter the first date, using the format YYYY-MM-DD.");
        String firstDateInString = scan.nextLine();

        System.out.println("Enter the second date, using the same format.");
        String secondDateInString = scan.nextLine();

        LocalDate formattedFirstDate = LocalDate.parse(firstDateInString);
        LocalDate formattedSecondDate = LocalDate.parse(secondDateInString);

        long daysBetween = ChronoUnit.DAYS.between(formattedFirstDate, formattedSecondDate);

        System.out.println("Between " + firstDateInString + " and " + secondDateInString + " there are " +
                daysBetween + " days.");
    }
}