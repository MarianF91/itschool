package course9.homework.challenge13;

import java.time.Duration;
import java.time.LocalDateTime;

public class Events {

    private final String eventName;
    private final String eventDescription;
    private final LocalDateTime eventDateTime;
    private final LocalDateTime reminderDateTime;

    public Events(String eventName, String eventDescription, LocalDateTime eventDateTime, LocalDateTime reminderDateTime) {
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.eventDateTime = eventDateTime;
        this.reminderDateTime = reminderDateTime;
    }

    public String getEventName() {

        return eventName;
    }

    public String getEventDescription() {

        return eventDescription;
    }

    public LocalDateTime getEventDateTime() {

        return eventDateTime;
    }

    public LocalDateTime getReminderDateTime() {

        return reminderDateTime;
    }

    public Duration timeUntilEvent(){

        return Duration.between(LocalDateTime.now(),eventDateTime);
    }

    public Duration timeUntilReminder(){
        if (reminderDateTime == null) {
            return null;
        } else {
            return Duration.between(LocalDateTime.now(), reminderDateTime);
        }
    }
}