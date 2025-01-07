package course9.homework;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Challenge12 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        convertToTimeZone();

    }

    public static void convertToTimeZone() {
        LocalDateTime conversionToDateAndTime = dateAndTimeSelection();
        int[] timeZoneChoices = timeZoneSelection();
        int firstAnswer = timeZoneChoices[0];
        int secondAnswer = timeZoneChoices[1];

        if (firstAnswer == 1) {
            conversionFromUtc(secondAnswer, conversionToDateAndTime);
        } else if (firstAnswer == 2) {
            conversionFromPst(secondAnswer, conversionToDateAndTime);
        } else if (firstAnswer == 3) {
            conversionFromPdt(secondAnswer, conversionToDateAndTime);
        } else if (firstAnswer == 4) {
            conversionFromMst(secondAnswer, conversionToDateAndTime);
        } else if (firstAnswer == 5) {
            conversionFromMdt(secondAnswer, conversionToDateAndTime);
        } else if (firstAnswer == 6) {
            conversionFromCst(secondAnswer, conversionToDateAndTime);
        } else if (firstAnswer == 7) {
            conversionFromCdt(secondAnswer, conversionToDateAndTime);
        } else if (firstAnswer == 8) {
            conversionFromEst(secondAnswer, conversionToDateAndTime);
        } else if (firstAnswer == 9) {
            conversionFromEdt(secondAnswer, conversionToDateAndTime);
        } else if (firstAnswer == 10) {
            conversionFromIst(secondAnswer, conversionToDateAndTime);
        } else if (firstAnswer == 11) {
            conversionFromJst(secondAnswer, conversionToDateAndTime);
        } else if (firstAnswer == 12) {
            conversionFromAest(secondAnswer, conversionToDateAndTime);
        } else if (firstAnswer == 13) {
            conversionFromCet(secondAnswer, conversionToDateAndTime);
        } else {
            conversionFromBst(secondAnswer, conversionToDateAndTime);
        }
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

    public static int[] timeZoneSelection() {

        System.out.println("In which time zone are you now? Choose an option between 1 and 14:\n1) UTC (Coordinated Universal Time)/" +
                "GMT (Greenwich Mean Time);\n2) PST (Pacific Standard Time);\n3) PDT (Pacific Daylight Time);\n4) MST (Mountain Standard Time);\n" +
                "5) MDT (Mountain Daylight Time);\n6) CST (Central Standard Time);\n7) CDT (Central Daylight Time);\n" +
                "8) EST (Eastern Standard Time);\n9) EDT (Eastern Daylight Time);\n10) IST (Indian Standard Time);\n11) JST (Japan Standard Time);\n" +
                "12) AEST (Australian Eastern Standard Time);\n13) CET (Central European Time);\n14) BST (British Summer Time);\n");

        int firstAnswer = scan.nextInt();

        while (firstAnswer < 1 || firstAnswer > 14) {
            System.out.println("Invalid option. Please enter an option between 1 and 14.");
            firstAnswer = scan.nextInt();
        }

        switch (firstAnswer) {
            case 1 -> System.out.println("You chose UTC/GMT (Coordinated Universal Time/Greenwich Mean Time).\n");
            case 2 -> System.out.println("You chose PST (Pacific Standard Time).\n");
            case 3 -> System.out.println("You chose PDT (Pacific Daylight Time).\n");
            case 4 -> System.out.println("You chose MST (Mountain Standard Time).\n");
            case 5 -> System.out.println("You chose MDT (Mountain Daylight Time).\n");
            case 6 -> System.out.println("You chose CST (Central Standard Time).\n");
            case 7 -> System.out.println("You chose CDT (Central Daylight Time).\n");
            case 8 -> System.out.println("You chose EST (Eastern Standard Time).\n");
            case 9 -> System.out.println("You chose EDT (Eastern Daylight Time).\n");
            case 10 -> System.out.println("You chose IST (Indian Standard Time).\n");
            case 11 -> System.out.println("You chose JST (Japan Standard Time).\n");
            case 12 -> System.out.println("You chose AEST (Australian Eastern Standard Time).\n");
            case 13 -> System.out.println("You chose CET (Central European Time).\n");
            case 14 -> System.out.println("You chose BST (British Summer Time).\n");
        }

        System.out.println("Choose the time zone to convert to. Pick an option between 1 and 14:\n1) UTC (Coordinated Universal Time)/" +
                "GMT (Greenwich Mean Time);\n2) PST (Pacific Standard Time);\n3) PDT (Pacific Daylight Time);\n4) MST (Mountain Standard Time);\n" +
                "5) MDT (Mountain Daylight Time);\n6) CST (Central Standard Time);\n7) CDT (Central Daylight Time);\n" +
                "8) EST (Eastern Standard Time);\n9) EDT (Eastern Daylight Time);\n10) IST (Indian Standard Time);\n11) JST (Japan Standard Time);\n" +
                "12) AEST (Australian Eastern Standard Time);\n13) CET (Central European Time);\n14) BST (British Summer Time);\n");

        int secondAnswer = scan.nextInt();

        while (secondAnswer < 1 || secondAnswer > 14) {
            System.out.println("Invalid option. Please enter an option between 1 and 14.");
            secondAnswer = scan.nextInt();
        }

        switch (secondAnswer) {
            case 1 ->
                    System.out.println("You chose conversion to UTC/GMT (Coordinated Universal Time/Greenwich Mean Time).\n");
            case 2 -> System.out.println("You chose conversion to PST (Pacific Standard Time).\n");
            case 3 -> System.out.println("You chose conversion to PDT (Pacific Daylight Time).\n");
            case 4 -> System.out.println("You chose conversion to MST (Mountain Standard Time).\n");
            case 5 -> System.out.println("You chose conversion to MDT (Mountain Daylight Time).\n");
            case 6 -> System.out.println("You chose conversion to CST (Central Standard Time).\n");
            case 7 -> System.out.println("You chose conversion to CDT (Central Daylight Time).\n");
            case 8 -> System.out.println("You chose conversion to EST (Eastern Standard Time).\n");
            case 9 -> System.out.println("You chose conversion to EDT (Eastern Daylight Time).\n");
            case 10 -> System.out.println("You chose conversion to IST (Indian Standard Time).\n");
            case 11 -> System.out.println("You chose conversion to JST (Japan Standard Time).\n");
            case 12 -> System.out.println("You chose conversion to AEST (Australian Eastern Standard Time).\n");
            case 13 -> System.out.println("You chose conversion to CET (Central European Time).\n");
            case 14 -> System.out.println("You chose conversion to BST (British Summer Time).\n");
        }
        return new int[]{firstAnswer, secondAnswer};
    }


    public static void conversionFromUtc(int secondAnswer, LocalDateTime conversionToDateAndTime) {
        LocalDateTime conversionFromUtc;

        if (secondAnswer == 1) {
            System.out.println("No conversion needed.");
            conversionFromUtc = conversionToDateAndTime;
        } else if (secondAnswer == 2) {
            conversionFromUtc = conversionToDateAndTime.minusHours(8);
        } else if (secondAnswer == 3 || secondAnswer == 4) {
            conversionFromUtc = conversionToDateAndTime.minusHours(7);
        } else if (secondAnswer == 5 || secondAnswer == 6) {
            conversionFromUtc = conversionToDateAndTime.minusHours(6);
        } else if (secondAnswer == 7 || secondAnswer == 8) {
            conversionFromUtc = conversionToDateAndTime.minusHours(5);
        } else if (secondAnswer == 9) {
            conversionFromUtc = conversionToDateAndTime.minusHours(4);
        } else if (secondAnswer == 10) {
            conversionFromUtc = conversionToDateAndTime.plusHours(5).plusMinutes(30);
        } else if (secondAnswer == 11) {
            conversionFromUtc = conversionToDateAndTime.plusHours(9);
        } else if (secondAnswer == 12) {
            conversionFromUtc = conversionToDateAndTime.plusHours(10);
        } else {
            conversionFromUtc = conversionToDateAndTime.plusHours(1);
        }
        System.out.println("The result is: " + conversionFromUtc.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }

    public static void conversionFromPst(int secondAnswer, LocalDateTime conversionToDateAndTime) {
        LocalDateTime conversionFromPst;

        if (secondAnswer == 2 || secondAnswer == 3 || secondAnswer == 5) {
            System.out.println("No conversion needed.");
            conversionFromPst = conversionToDateAndTime;
        } else if (secondAnswer == 1) {
            conversionFromPst = conversionToDateAndTime.plusHours(8);
        } else if (secondAnswer == 4) {
            conversionFromPst = conversionToDateAndTime.minusHours(1);
        } else if (secondAnswer == 6) {
            conversionFromPst = conversionToDateAndTime.plusHours(2);
        } else if (secondAnswer == 7) {
            conversionFromPst = conversionToDateAndTime.plusHours(3);
        } else if (secondAnswer == 8) {
            conversionFromPst = conversionToDateAndTime.plusHours(3);
        } else if (secondAnswer == 9) {
            conversionFromPst = conversionToDateAndTime.plusHours(4);
        } else if (secondAnswer == 10) {
            conversionFromPst = conversionToDateAndTime.plusHours(16).plusMinutes(30);
        } else if (secondAnswer == 11) {
            conversionFromPst = conversionToDateAndTime.plusHours(17);
        } else if (secondAnswer == 12) {
            conversionFromPst = conversionToDateAndTime.plusHours(18);
        } else {
            conversionFromPst = conversionToDateAndTime.plusHours(9);
        }
        System.out.println("The result is: " + conversionFromPst.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }

    public static void conversionFromPdt(int secondAnswer, LocalDateTime conversionToDateAndTime) {
        LocalDateTime conversionFromPdt;

        if (secondAnswer == 2 || secondAnswer == 3 || secondAnswer == 4) {
            System.out.println("No conversion needed.");
            conversionFromPdt = conversionToDateAndTime;
        } else if (secondAnswer == 1) {
            conversionFromPdt = conversionToDateAndTime.plusHours(7);
        } else if (secondAnswer == 5 || secondAnswer == 6) {
            conversionFromPdt = conversionToDateAndTime.plusHours(1);
        } else if (secondAnswer == 7 || secondAnswer == 8) {
            conversionFromPdt = conversionToDateAndTime.plusHours(2);
        } else if (secondAnswer == 9) {
            conversionFromPdt = conversionToDateAndTime.plusHours(3);
        } else if (secondAnswer == 10) {
            conversionFromPdt = conversionToDateAndTime.plusHours(12).plusMinutes(30);
        } else if (secondAnswer == 11) {
            conversionFromPdt = conversionToDateAndTime.plusHours(16);
        } else if (secondAnswer == 12) {
            conversionFromPdt = conversionToDateAndTime.plusHours(17);
        } else if (secondAnswer == 13) {
            conversionFromPdt = conversionToDateAndTime.plusHours(8);
        } else {
            conversionFromPdt = conversionToDateAndTime.plusHours(7);
        }
        System.out.println("The result is: " + conversionFromPdt.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }

    public static void conversionFromMst(int secondAnswer, LocalDateTime conversionToDateAndTime) {
        LocalDateTime conversionFromMst;

        if (secondAnswer == 3 || secondAnswer == 4) {
            System.out.println("No conversion needed.");
            conversionFromMst = conversionToDateAndTime;
        } else if (secondAnswer == 1 || secondAnswer == 14) {
            conversionFromMst = conversionToDateAndTime.plusHours(7);
        } else if (secondAnswer == 2) {
            conversionFromMst = conversionToDateAndTime.minusHours(1);
        } else if (secondAnswer == 5 || secondAnswer == 6) {
            conversionFromMst = conversionToDateAndTime.plusHours(1);
        } else if (secondAnswer == 7 || secondAnswer == 8) {
            conversionFromMst = conversionToDateAndTime.plusHours(2);
        } else if (secondAnswer == 9) {
            conversionFromMst = conversionToDateAndTime.plusHours(3);
        } else if (secondAnswer == 10) {
            conversionFromMst = conversionToDateAndTime.plusHours(12).plusMinutes(30);
        } else if (secondAnswer == 11) {
            conversionFromMst = conversionToDateAndTime.plusHours(16);
        } else if (secondAnswer == 12) {
            conversionFromMst = conversionToDateAndTime.plusHours(17);
        } else {
            conversionFromMst = conversionToDateAndTime.plusHours(8);
        }
        System.out.println("The result is: " + conversionFromMst.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }

    public static void conversionFromMdt(int secondAnswer, LocalDateTime conversionToDateAndTime) {
        LocalDateTime conversionFromMst;

        if (secondAnswer == 4 || secondAnswer == 5 || secondAnswer == 6) {
            System.out.println("No conversion needed.");
            conversionFromMst = conversionToDateAndTime;
        } else if (secondAnswer == 1 || secondAnswer == 14) {
            conversionFromMst = conversionToDateAndTime.plusHours(6);
        } else if (secondAnswer == 2 || secondAnswer == 3) {
            conversionFromMst = conversionToDateAndTime.minusHours(1);
        } else if (secondAnswer == 7 || secondAnswer == 8) {
            conversionFromMst = conversionToDateAndTime.plusHours(1);
        } else if (secondAnswer == 9) {
            conversionFromMst = conversionToDateAndTime.plusHours(2);
        } else if (secondAnswer == 10) {
            conversionFromMst = conversionToDateAndTime.plusHours(11).plusMinutes(30);
        } else if (secondAnswer == 11) {
            conversionFromMst = conversionToDateAndTime.plusHours(15);
        } else if (secondAnswer == 12) {
            conversionFromMst = conversionToDateAndTime.plusHours(16);
        } else {
            conversionFromMst = conversionToDateAndTime.plusHours(7);
        }
        System.out.println("The result is: " + conversionFromMst.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }

    public static void conversionFromCst(int secondAnswer, LocalDateTime conversionToDateAndTime) {
        LocalDateTime conversionFromCst;

        if (secondAnswer == 5 || secondAnswer == 6 || secondAnswer == 7) {
            System.out.println("No conversion needed.");
            conversionFromCst = conversionToDateAndTime;
        } else if (secondAnswer == 1 || secondAnswer == 14) {
            conversionFromCst = conversionToDateAndTime.plusHours(6);
        } else if (secondAnswer == 2 || secondAnswer == 3) {
            conversionFromCst = conversionToDateAndTime.minusHours(2);
        } else if (secondAnswer == 4) {
            conversionFromCst = conversionToDateAndTime.minusHours(1);
        } else if (secondAnswer == 8) {
            conversionFromCst = conversionToDateAndTime.plusHours(1);
        } else if (secondAnswer == 9) {
            conversionFromCst = conversionToDateAndTime.plusHours(2);
        } else if (secondAnswer == 10) {
            conversionFromCst = conversionToDateAndTime.plusHours(11).plusMinutes(30);
        } else if (secondAnswer == 11) {
            conversionFromCst = conversionToDateAndTime.plusHours(15);
        } else if (secondAnswer == 12) {
            conversionFromCst = conversionToDateAndTime.plusHours(16);
        } else {
            conversionFromCst = conversionToDateAndTime.plusHours(7);
        }
        System.out.println("The result is: " + conversionFromCst.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }

    public static void conversionFromCdt(int secondAnswer, LocalDateTime conversionToDateAndTime) {
        LocalDateTime conversionFromCdt;

        if (secondAnswer == 5 || secondAnswer == 6 || secondAnswer == 7) {
            System.out.println("No conversion needed.");
            conversionFromCdt = conversionToDateAndTime;
        } else if (secondAnswer == 1 || secondAnswer == 14) {
            conversionFromCdt = conversionToDateAndTime.plusHours(5);
        } else if (secondAnswer == 2 || secondAnswer == 3) {
            conversionFromCdt = conversionToDateAndTime.minusHours(2);
        } else if (secondAnswer == 4) {
            conversionFromCdt = conversionToDateAndTime.minusHours(1);
        } else if (secondAnswer == 8) {
            conversionFromCdt = conversionToDateAndTime.plusHours(1);
        } else if (secondAnswer == 9) {
            conversionFromCdt = conversionToDateAndTime.plusHours(2);
        } else if (secondAnswer == 10) {
            conversionFromCdt = conversionToDateAndTime.plusHours(10).plusMinutes(30);
        } else if (secondAnswer == 11) {
            conversionFromCdt = conversionToDateAndTime.plusHours(14);
        } else if (secondAnswer == 12) {
            conversionFromCdt = conversionToDateAndTime.plusHours(15);
        } else {
            conversionFromCdt = conversionToDateAndTime.plusHours(6);
        }
        System.out.println("The result is: " + conversionFromCdt.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }

    public static void conversionFromEst(int secondAnswer, LocalDateTime conversionToDateAndTime) {
        LocalDateTime conversionFromEst;

        if (secondAnswer == 7 || secondAnswer == 8 || secondAnswer == 9) {
            System.out.println("No conversion needed.");
            conversionFromEst = conversionToDateAndTime;
        } else if (secondAnswer == 1 || secondAnswer == 14) {
            conversionFromEst = conversionToDateAndTime.plusHours(5);
        } else if (secondAnswer == 2 || secondAnswer == 3) {
            conversionFromEst = conversionToDateAndTime.minusHours(3);
        } else if (secondAnswer == 4) {
            conversionFromEst = conversionToDateAndTime.minusHours(2);
        } else if (secondAnswer == 5 || secondAnswer == 6) {
            conversionFromEst = conversionToDateAndTime.minusHours(1);
        } else if (secondAnswer == 10) {
            conversionFromEst = conversionToDateAndTime.plusHours(10).plusMinutes(30);
        } else if (secondAnswer == 11) {
            conversionFromEst = conversionToDateAndTime.plusHours(14);
        } else if (secondAnswer == 12) {
            conversionFromEst = conversionToDateAndTime.plusHours(15);
        } else {
            conversionFromEst = conversionToDateAndTime.plusHours(6);
        }
        System.out.println("The result is: " + conversionFromEst.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }

    public static void conversionFromEdt(int secondAnswer, LocalDateTime conversionToDateAndTime) {
        LocalDateTime conversionFromEdt;

        if (secondAnswer == 7 || secondAnswer == 8 || secondAnswer == 9) {
            System.out.println("No conversion needed.");
            conversionFromEdt = conversionToDateAndTime;
        } else if (secondAnswer == 1 || secondAnswer == 14) {
            conversionFromEdt = conversionToDateAndTime.plusHours(4);
        } else if (secondAnswer == 2 || secondAnswer == 3) {
            conversionFromEdt = conversionToDateAndTime.minusHours(3);
        } else if (secondAnswer == 4) {
            conversionFromEdt = conversionToDateAndTime.minusHours(2);
        } else if (secondAnswer == 5 || secondAnswer == 6) {
            conversionFromEdt = conversionToDateAndTime.minusHours(1);
        } else if (secondAnswer == 10) {
            conversionFromEdt = conversionToDateAndTime.plusHours(9).plusMinutes(30);
        } else if (secondAnswer == 11) {
            conversionFromEdt = conversionToDateAndTime.plusHours(13);
        } else if (secondAnswer == 12) {
            conversionFromEdt = conversionToDateAndTime.plusHours(13);
        } else {
            conversionFromEdt = conversionToDateAndTime.plusHours(5);
        }
        System.out.println("The result is: " + conversionFromEdt.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }

    public static void conversionFromIst(int secondAnswer, LocalDateTime conversionToDateAndTime) {
        LocalDateTime conversionFromIst = null;

        if (secondAnswer == 10) {
            System.out.println("No conversion needed.");
            conversionFromIst = conversionToDateAndTime;
        } else if (secondAnswer == 1) {
            conversionFromIst = conversionToDateAndTime.minusHours(5).minusMinutes(30);
        } else if (secondAnswer == 2) {
            conversionFromIst = conversionToDateAndTime.minusHours(13).minusMinutes(30);
        } else if (secondAnswer == 3 || secondAnswer == 4) {
            conversionFromIst = conversionToDateAndTime.minusHours(12).minusMinutes(30);
        } else if (secondAnswer == 5 || secondAnswer == 6) {
            conversionFromIst = conversionToDateAndTime.minusHours(11).minusMinutes(30);
        } else if (secondAnswer == 7 || secondAnswer == 8) {
            conversionFromIst = conversionToDateAndTime.minusHours(10).minusMinutes(30);
        } else if (secondAnswer == 9) {
            conversionFromIst = conversionToDateAndTime.minusHours(9).plusMinutes(30);
        } else if (secondAnswer == 11) {
            conversionFromIst = conversionToDateAndTime.plusHours(3).plusMinutes(30);
        } else if (secondAnswer == 12) {
            conversionFromIst = conversionToDateAndTime.plusHours(4).plusMinutes(30);
        } else if (secondAnswer == 13 || secondAnswer == 14) {
            conversionFromIst = conversionToDateAndTime.minusHours(4).minusMinutes(30);
        }
        System.out.println("The result is: " + conversionFromIst.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }

    public static void conversionFromJst(int secondAnswer, LocalDateTime conversionToDateAndTime) {
        LocalDateTime conversionFromJst;

        if (secondAnswer == 11) {
            System.out.println("No conversion needed.");
            conversionFromJst = conversionToDateAndTime;
        } else if (secondAnswer == 1) {
            conversionFromJst = conversionToDateAndTime.minusHours(9);
        } else if (secondAnswer == 2) {
            conversionFromJst = conversionToDateAndTime.minusHours(17);
        } else if (secondAnswer == 3) {
            conversionFromJst = conversionToDateAndTime.minusHours(16);
        } else if (secondAnswer == 4 || secondAnswer == 5) {
            conversionFromJst = conversionToDateAndTime.minusHours(15);
        } else if (secondAnswer == 6) {
            conversionFromJst = conversionToDateAndTime.minusHours(14);
        } else if (secondAnswer == 7 || secondAnswer == 8) {
            conversionFromJst = conversionToDateAndTime.minusHours(14);
        } else if (secondAnswer == 9) {
            conversionFromJst = conversionToDateAndTime.minusHours(13);
        } else if (secondAnswer == 10) {
            conversionFromJst = conversionToDateAndTime.minusHours(3).minusMinutes(30);
        } else if (secondAnswer == 12) {
            conversionFromJst = conversionToDateAndTime.plusHours(1);
        } else {
            conversionFromJst = conversionToDateAndTime.minusHours(8);
        }
        System.out.println("The result is: " + conversionFromJst.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }

    public static void conversionFromAest(int secondAnswer, LocalDateTime conversionToDateAndTime) {
        LocalDateTime conversionFromAest;

        if (secondAnswer == 12) {
            System.out.println("No conversion needed.");
            conversionFromAest = conversionToDateAndTime;
        } else if (secondAnswer == 1) {
            conversionFromAest = conversionToDateAndTime.minusHours(10);
        } else if (secondAnswer == 2) {
            conversionFromAest = conversionToDateAndTime.minusHours(18);
        } else if (secondAnswer == 3 || secondAnswer == 4) {
            conversionFromAest = conversionToDateAndTime.minusHours(17);
        } else if (secondAnswer == 5 || secondAnswer == 6) {
            conversionFromAest = conversionToDateAndTime.minusHours(16);
        } else if (secondAnswer == 7 || secondAnswer == 8) {
            conversionFromAest = conversionToDateAndTime.minusHours(15);
        } else if (secondAnswer == 9) {
            conversionFromAest = conversionToDateAndTime.minusHours(14);
        } else if (secondAnswer == 10) {
            conversionFromAest = conversionToDateAndTime.minusHours(4).minusMinutes(30);
        } else if (secondAnswer == 11) {
            conversionFromAest = conversionToDateAndTime.minusHours(1);
        } else {
            conversionFromAest = conversionToDateAndTime.minusHours(9);
        }
        System.out.println("The result is: " + conversionFromAest.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }

    public static void conversionFromCet(int secondAnswer, LocalDateTime conversionToDateAndTime) {
        LocalDateTime conversionFromCet;

        if (secondAnswer == 13 || secondAnswer == 14) {
            System.out.println("No conversion needed.");
            conversionFromCet = conversionToDateAndTime;
        } else if (secondAnswer == 1) {
            conversionFromCet = conversionToDateAndTime.minusHours(1);
        } else if (secondAnswer == 2) {
            conversionFromCet = conversionToDateAndTime.minusHours(9);
        } else if (secondAnswer == 3 || secondAnswer == 4) {
            conversionFromCet = conversionToDateAndTime.minusHours(8);
        } else if (secondAnswer == 5 || secondAnswer == 6) {
            conversionFromCet = conversionToDateAndTime.minusHours(7);
        } else if (secondAnswer == 7 || secondAnswer == 8) {
            conversionFromCet = conversionToDateAndTime.minusHours(6);
        } else if (secondAnswer == 9) {
            conversionFromCet = conversionToDateAndTime.minusHours(5);
        } else if (secondAnswer == 10) {
            conversionFromCet = conversionToDateAndTime.plusHours(4).plusMinutes(30);
        } else if (secondAnswer == 11) {
            conversionFromCet = conversionToDateAndTime.plusHours(8);
        } else {
            conversionFromCet = conversionToDateAndTime.plusHours(9);
        }
        System.out.println("The result is: " + conversionFromCet.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }

    public static void conversionFromBst(int secondAnswer, LocalDateTime conversionToDateAndTime) {
        LocalDateTime conversionFromBst;

        if (secondAnswer == 13 || secondAnswer == 14) {
            System.out.println("No conversion needed.");
            conversionFromBst = conversionToDateAndTime;
        } else if (secondAnswer == 1) {
            conversionFromBst = conversionToDateAndTime.minusHours(1);
        } else if (secondAnswer == 2) {
            conversionFromBst = conversionToDateAndTime.minusHours(9);
        } else if (secondAnswer == 3 || secondAnswer == 4) {
            conversionFromBst = conversionToDateAndTime.minusHours(8);
        } else if (secondAnswer == 5 || secondAnswer == 6) {
            conversionFromBst = conversionToDateAndTime.minusHours(7);
        } else if (secondAnswer == 7 || secondAnswer == 8) {
            conversionFromBst = conversionToDateAndTime.minusHours(6);
        } else if (secondAnswer == 9) {
            conversionFromBst = conversionToDateAndTime.minusHours(5);
        } else if (secondAnswer == 10) {
            conversionFromBst = conversionToDateAndTime.plusHours(4).plusMinutes(30);
        } else if (secondAnswer == 11) {
            conversionFromBst = conversionToDateAndTime.plusHours(8);
        } else {
            conversionFromBst = conversionToDateAndTime.plusHours(9);
        }
        System.out.println("The result is: " + conversionFromBst.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
}