package course12and13.homework.challenge4;

import java.util.ArrayList;
import java.util.List;

public class User {

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


    public void addWorkout(Workout workout) {
        workoutHistory.add(workout);
    }

    @Override
    public String toString() {
        return "\nName: " + name + "\n" +
                "Age: " + age + "\n" +
                "Workout History: \n" + workoutHistory + "\n" +
                "Objectives: \n" + objectiveList + "\n";
    }
}