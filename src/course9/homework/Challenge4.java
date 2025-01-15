package course9.homework;

import java.time.LocalDate;
import java.util.Scanner;

public class Challenge4 {

    public static void main(String[] args) {

        areDatesEqual();
    }

    public static void areDatesEqual() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a date using the format YYYY-MM-DD");
        String firstDate = scanner.nextLine();
        LocalDate firstDateFormatted = LocalDate.parse(firstDate);

        System.out.println("Enter a second date using the same format.");
        String secondDate = scanner.nextLine();
        LocalDate secondDateFormatted = LocalDate.parse(secondDate);

        if (firstDateFormatted.isEqual(secondDateFormatted)) {
            System.out.println("The dates are equal.");
        } else {
            System.out.println("The dates are not equal.");
        }
    }
}
