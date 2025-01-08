package course9.homework.challenge13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

    //this is used to manage events;
public class Scheduler {

    private static final ArrayList<Events> eventsList = new ArrayList<>();

    public void addEvent(Events e) {
        eventsList.add(e);
    }

    public void removeEvent (String eventName){
        eventsList.removeIf(events -> events.getEventName().equalsIgnoreCase(eventName));
    }

    public List<Events> getUpcomingEvents(int i){

        eventsList.sort((e1, e2) -> e1.getEventDateTime().compareTo(e2.getEventDateTime()));
        return eventsList.subList(0, Math.min(i, eventsList.size()));
    }

    public List<Events> getCurrentEvents (LocalDate date){

        return eventsList.stream().filter(events -> events.getEventDateTime().toLocalDate().equals(date)).toList();
    }

    public List<Events> pendingRemainders(){

        LocalDateTime currentDateAndTime = LocalDateTime.now();

        return eventsList.stream().filter(events -> events.getReminderDateTime() != null &&
                        events.getReminderDateTime().isBefore(currentDateAndTime.plusHours(24))).toList();
    }
}