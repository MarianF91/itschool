package course9.homework;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Challenge8 {

    public static void main(String[] args) {

        findDayOfWeek();
    }

    public static void findDayOfWeek() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a date to see it's day of week. Please use format YYYY-MM-DD.");

        String chosenDate = scan.nextLine();
        LocalDate enteredDate = LocalDate.parse(chosenDate);
        DayOfWeek day = enteredDate.getDayOfWeek();

        System.out.println(chosenDate + " was on a " + day + ".");
    }
}