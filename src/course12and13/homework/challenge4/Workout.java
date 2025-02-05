package course12and13.homework.challenge4;

import java.time.Duration;
import java.time.LocalDate;

public class Workout {

    private LocalDate date;
    private Duration workoutDuration;

    public Workout(LocalDate date, Duration workoutDuration) {

        this.date = date;
        this.workoutDuration = workoutDuration;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Duration getWorkoutDuration() {
        return workoutDuration;
    }

    public void setWorkoutDuration(Duration workoutDuration) {
        this.workoutDuration = workoutDuration;
    }

    @Override
    public String toString() {
        return "Workout" +
                "\n  Date: " + date +
                "\n  Duration: " + workoutDuration;
    }
}