package course9.homework;

import java.time.LocalDate;

public class Challenge5 {

    public static void main(String[] args) {

        isTodaySpecificDate();
    }

    public static void isTodaySpecificDate() {

        System.out.println("Let's see if today is 10th of December 2019");

        LocalDate currentDate = LocalDate.now();
        LocalDate comparisonDate = LocalDate.of(2019, 10, 19);

        System.out.println("Is today 10.12.2019?");

        if (currentDate.isEqual(comparisonDate)) {
            System.out.println("Yes.");
        } else {
            System.out.println("No. Today is " + currentDate);
        }
    }
}