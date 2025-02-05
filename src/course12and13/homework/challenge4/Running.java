package course12and13.homework.challenge4;

import java.time.Duration;
import java.time.LocalDate;

public class Running extends Workout {

    private int laps;
    private double distance;

    public Running(LocalDate date, Duration workoutDuration, int laps, double distance) {

        super(date, workoutDuration);
        this.distance = distance;
        this.laps = laps;
    }

    public int getLaps() {
        return laps;
    }

    public void setLaps(int laps) {
        this.laps = laps;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Running" +
                "\n  Laps: " + laps +
                "\n  Distance: " + distance + " km.";
    }
}