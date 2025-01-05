package course9.homework;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Challenge6 {

    public static void main(String[] args) {

        displayCurrentTime();
    }

    public static void displayCurrentTime(){

        LocalTime time = LocalTime.now();
        DateTimeFormatter formattedTime = DateTimeFormatter.ofPattern("HH:mm:ss");
        String currentTime = time.format(formattedTime);
        System.out.println("The current time is: " + currentTime);
    }
}