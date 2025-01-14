package course9.homework;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Challenge12b {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        convertToTimeZone();

    }

    public static void convertToTimeZone() {
        LocalDateTime localDateTime = dateAndTimeSelection();
        ZoneId sourceZoneId = timeZoneSelection("Enter your current time zone.");
        ZoneId targetZoneId = timeZoneSelection("Enter the time zone to convert to.");

        ZonedDateTime zonedDateTime = localDateTime.atZone(sourceZoneId);
        ZonedDateTime convertedDateTime = zonedDateTime.withZoneSameInstant(targetZoneId);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedTime = convertedDateTime.toLocalDateTime().format(formatter);

        System.out.println("The converted time is: " + formattedTime);
    }

    public static LocalDateTime dateAndTimeSelection() {
        LocalDateTime conversionToDateAndTime = null;
        boolean validInput = false;

        while (!validInput) {
            System.out.println("Enter a date and a time in the following format YYYY-MM-DD HH:MM:SS.");
            String dateAndTime = scan.nextLine();

            try {
                DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                conversionToDateAndTime = LocalDateTime.parse(dateAndTime, format);
                validInput = true;
            } catch (DateTimeParseException e) {
                System.out.println("Invalid input.");
            }
        }
        return conversionToDateAndTime;
    }

    public static ZoneId timeZoneSelection(String text) {

        System.out.println(text);
        System.out.print("Choose a Time Zone between 1 and 14:\n1) UTC (Coordinated Universal Time)/" +
                "GMT (Greenwich Mean Time);\n2) PST (Pacific Standard Time);\n3) PDT (Pacific Daylight Time);\n4) MST (Mountain Standard Time);\n" +
                "5) MDT (Mountain Daylight Time);\n6) CST (Central Standard Time);\n7) CDT (Central Daylight Time);\n" +
                "8) EST (Eastern Standard Time);\n9) EDT (Eastern Daylight Time);\n10) IST (Indian Standard Time);\n11) JST (Japan Standard Time);\n" +
                "12) AEST (Australian Eastern Standard Time);\n13) CET (Central European Time);\n14) BST (British Summer Time);\n");

        int answer = getChoice();

        return switch (answer) {
            case 1 -> ZoneId.of("UTC");
            case 2 -> ZoneId.of("America/Los_Angeles"); // PST
            case 3 -> ZoneId.of("America/Los_Angeles"); // PDT
            case 4 -> ZoneId.of("America/Denver"); // MST
            case 5 -> ZoneId.of("America/Denver"); // MDT
            case 6 -> ZoneId.of("America/Chicago"); // CST
            case 7 -> ZoneId.of("America/Chicago"); // CDT
            case 8 -> ZoneId.of("America/New_York"); // EST
            case 9 -> ZoneId.of("America/New_York"); // EDT
            case 10 -> ZoneId.of("Asia/Kolkata"); // IST
            case 11 -> ZoneId.of("Asia/Tokyo"); // JST
            case 12 -> ZoneId.of("Australia/Sydney"); // AEST
            case 13 -> ZoneId.of("Europe/Berlin"); // CET
            case 14 -> ZoneId.of("Europe/London"); // BST
            default -> throw new IllegalArgumentException("Invalid choice.");
        };
    }

    private static int getChoice() {
        int choice = scan.nextInt();
        scan.nextLine();

        while (choice < 1 || choice > 14) {
            System.out.println("Invalid option. Please enter an option between " + 1 + " and " + 14 + ".");
            choice = scan.nextInt();
            scan.nextLine();
        }
        return choice;
    }
}