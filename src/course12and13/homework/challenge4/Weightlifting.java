package course12and13.homework.challenge4;

import java.time.Duration;
import java.time.LocalDate;

public class Weightlifting extends Workout {

    private double usedWeight;
    private int reps;
    private int sets;

    public Weightlifting(LocalDate date,
                         Duration workoutDuration,
                         double usedWeight,
                         int reps,
                         int sets) {
        super(date, workoutDuration);
        this.reps = reps;
        this.sets = sets;
        this.usedWeight = usedWeight;
    }

    public double getUsedWeight() {
        return usedWeight;
    }

    public void setUsedWeight(double usedWeight) {
        this.usedWeight = usedWeight;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    @Override
    public String toString() {
        return "Weightlifting:" +
                "\n  Used Weight: " + usedWeight +
                "\n  Number of Reps per Set: " + reps +
                "\n  Number of Sets: " + sets;
    }
}