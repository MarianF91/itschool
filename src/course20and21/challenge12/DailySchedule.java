package course20and21.challenge12;

import java.util.HashMap;
import java.util.Map;

public class DailySchedule {
    private final Map<DaysOfTheWeek, String> schedule;

    public DailySchedule() {
        this.schedule = new HashMap<>();
    }

    public void addActivity(DaysOfTheWeek day, String activity) {
        schedule.put(day, activity);
    }

    public Map<DaysOfTheWeek, String> getSchedule() {
        return schedule;
    }
}
