package course12and13.homework.challenge4;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User extends Objective {

    private String name;
    private int age;
    private final List<Workout> workoutHistory = new ArrayList<>();
    private final List<Objective> objectiveList = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public List<Objective> getObjectiveList() {
        return objectiveList;
    }


    public void addWorkout(LocalDate date,
                           Duration duration,
                           String type,
                           double distance,
                           int laps,
                           double weight,
                           int reps,
                           int sets) {
        if (type.equalsIgnoreCase("Weightlifting")){
            Weightlifting workoutType = new Weightlifting(date, duration, reps, sets);
            workoutType.setUsedWeight(weight);
            workoutHistory.add(workoutType);
        } else if (type.equalsIgnoreCase("Running")){
            Running workoutType = new Running(date, duration, laps, distance);
            workoutType.setDistance(distance);
            workoutHistory.add(workoutType);
        }
    }

    @Override
    public String toString() {
        return "\nName: " + name + "\n" +
                "Age: " + age + "\n" +
                "Workout History: \n" + workoutHistory + "\n" +
                "Objectives: \n" + objectiveList + "\n";
    }
}