package course9.homework.challenge13;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Challenge13 {

    public static void main(String[] args) {

        eventScheduler();
    }

    public static void eventScheduler() {

        Scanner scan = new Scanner(System.in); //used to get input from the keyboard;
        Scheduler scheduler = new Scheduler(); //used to manage the events;

        String[] initialInput = getUserInput(scan); //calls on the method getUserInput to get the initial event;
        LocalDateTime initialReminderDateTime = null; //gives the initial value to initialReminderDateTime;

        if (initialInput[3] != null && !initialInput[3].isEmpty()) {
            initialReminderDateTime = LocalDateTime.parse(initialInput[3], DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm"));
        }
        Events initialEvent = new Events(initialInput[0], initialInput[1],
                LocalDateTime.parse(initialInput[2], DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm")),
                initialReminderDateTime);
        scheduler.addEvent(initialEvent);

        while (true) {

            System.out.println("Do you want to:\n- add another event? Type <<add>>;\n- remove an event? Type <<remove>>\n" +
                    "- exit? Type <<exit>>.");
            String answer = scan.nextLine();

            if (answer.equalsIgnoreCase("exit")) {
                break;
            } else if (answer.equalsIgnoreCase("remove")) {
                System.out.println("Enter the name of the event that you want to remove:");
                String removeEvent = scan.nextLine(); //removes the desired event
                scheduler.removeEvent(removeEvent);
                System.out.println("The event: " + removeEvent + " has been removed.");
            } else if (answer.equalsIgnoreCase("add")) {
                String[] input = getUserInput(scan); //adds a new event;
                LocalDateTime reminderDateTime = null; //reinitialized reminderDateTime as null;

                if (input[3] != null && !input[3].isEmpty()) {
                    reminderDateTime = LocalDateTime.parse(input[3], DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm"));
                }
                //creates a new event object with the data provided;
                Events newEvent = new Events(input[0], input[1],
                        LocalDateTime.parse(input[2], DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm")),
                        reminderDateTime);
                scheduler.addEvent(newEvent); //sends the object to Scheduler class to be managed;
            } else {
                System.out.println("Enter a valid choice.");
            }
        }

        System.out.println("\nYour upcoming events are:");
        for (Events event : scheduler.getUpcomingEvents(Integer.MAX_VALUE)) {
            System.out.println("- " + event.getEventName() + ";\n- Description: " + event.getEventDescription() +
                    ";\n- Time until event: " + timeFormat(event.timeUntilEvent()) +
                    ";\n- Time until reminder: " + timeFormat(event.timeUntilReminder()) + ";");
        }

        // Display events on a specific date
        System.out.println("\nDo you want to see events on a specific date? (yes/no)");
        String seeEventsByDate = scan.nextLine();

        if (seeEventsByDate.equalsIgnoreCase("yes")) {
            System.out.println("Enter a date to see events on (e.g., 24.02.2025):");
            String inputDate = scan.nextLine();
            LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("dd.MM.yyyy"));

            System.out.println("\nEvents on " + date + ":");
            for (Events event : scheduler.getCurrentEvents(date)) {
                System.out.println("- " + event.getEventName() + ";\n- Description: " + event.getEventDescription());
            }
        }

        // Display upcoming reminders
        System.out.println("\nUpcoming reminders:");
        LocalDateTime localDateTime = LocalDateTime.now();
        for (Events event : scheduler.pendingRemainders()) {
            if (event.getReminderDateTime() != null &&
                    (event.getReminderDateTime().isBefore(localDateTime) ||
                            event.getReminderDateTime().isEqual(localDateTime))) {
                System.out.println("You have an event soon!\n- Event: " + event.getEventName() + "\n- Description: "
                        + event.getEventDescription() + "\n- Date and time: " + event.getEventDateTime().toString());
            }
        }
    }

    //User input
    private static String[] getUserInput(Scanner scan) {

        String[] input = new String[4]; //array created to store the details given by the user;

        try {
            System.out.println("Enter a new event:");
            input[0] = scan.nextLine();

            System.out.println("Enter a short description of the event:");
            input[1] = scan.nextLine();

            System.out.println("Enter the date and time of the event (e.g. 19.01.2025 19:35):");
            input[2] = scan.nextLine();

            System.out.println("When would you like to get a reminder about the event? Type <<yes>> or <<no>>");
            String hasReminder = scan.nextLine();

            if (hasReminder.equalsIgnoreCase("yes")) {
                System.out.println("Enter a date and time for the reminder (e.g. 18.01.2025 13:00):");
                input[3] = scan.nextLine();
            } else {
                input[3] = "";
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Using default values."); //if the user enters something wrong, it goes with default.
        }
        return input;
    }

    private static String timeFormat (Duration duration){

        if (duration == null){
            return "n/a"; //if we have no time duration, it returns n/a, otherwise it returns a countdown;
        }

        long daysLeft = duration.toDays(); //extracts the number of days from duration;
        long minutesLeft = duration.toMinutes(); //extracts the number of minutes from duration;
        long hoursLeft = duration.toHours(); //extracts the number of hours from duration.

        return String.format("%d days, %d hours, %d minutes", daysLeft, hoursLeft, minutesLeft); //prints the countdown.
    }
}