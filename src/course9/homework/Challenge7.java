package course9.homework;

import java.time.LocalDate;
import java.util.Scanner;

public class Challenge7 {

    public static void main(String[] args) {

        addWeeksToToday();
    }

    public static void addWeeksToToday() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number to see what date will be X weeks from today.");

        int addedWeeks = scan.nextInt();

        LocalDate currentDate = LocalDate.now();

        LocalDate futureDate = currentDate.plusWeeks(addedWeeks);

        System.out.println("Today is " + currentDate);
        System.out.println("In " + addedWeeks + " will be " + futureDate + ".");
    }
}