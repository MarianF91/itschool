package course9.homework;

import java.time.LocalDate;

public class Challenge1 {

    public static void main(String[] args) {

        localDate();

    }

    public static void localDate() {

        LocalDate date = LocalDate.now();

        System.out.println("Today is: " + date);
    }
}