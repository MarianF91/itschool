package course9.homework;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Challenge11 {

    public static void main(String[] args) {

        elapsedTimeSince();
    }

    public static void elapsedTimeSince() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the hour, minutes and seconds of your choosing in the format HH:mm:ss");

        String inputTime = scan.nextLine();
        LocalTime time = null;

        if (inputTime.length() < 8){

            String [] timeParts = inputTime.split(":");
            for (int i = 0; i < timeParts.length; i++){
                if (timeParts[i].length() < 2){
                    timeParts[i] = "0" + timeParts[i];
                }
            }
            inputTime = String.join(":", timeParts);
        }

        try {
            time = LocalTime.parse(inputTime);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid input");
        }

        LocalTime currentTime = LocalTime.now();


        Duration elapsedTime = Duration.between(currentTime, time).abs();

        long elapsedHours = elapsedTime.toHours();
        long elapsedMinutes = elapsedTime.toMinutes() % 60;
        long elapsedSeconds = elapsedTime.toSeconds() % 60;

        System.out.println("Since " + time + ", have passed " + elapsedHours + " hours, " + elapsedMinutes + "minutes and " + elapsedSeconds + " seconds.");
    }
}