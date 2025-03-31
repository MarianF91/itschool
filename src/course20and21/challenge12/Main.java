package course20and21.challenge12;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        DailySchedule dailySchedule = new DailySchedule();

        dailySchedule.addActivity(DaysOfTheWeek.MONDAY, "Jogging");
        dailySchedule.addActivity(DaysOfTheWeek.TUESDAY, "Gym");
        dailySchedule.addActivity(DaysOfTheWeek.WEDNESDAY, "Martial Arts");
        dailySchedule.addActivity(DaysOfTheWeek.THURSDAY, "Cooking Class");
        dailySchedule.addActivity(DaysOfTheWeek.FRIDAY, "Hiking");
        dailySchedule.addActivity(DaysOfTheWeek.SATURDAY, "Movie Night");
        dailySchedule.addActivity(DaysOfTheWeek.SUNDAY, "Batman training");

        for (Map.Entry<DaysOfTheWeek, String> entry : dailySchedule.getSchedule().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
