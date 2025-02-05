package course12and13.homework.challenge4;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        userProgress();

    }

    public static void userProgress() {

        List<User> userList = new ArrayList<>();

        User user1 = new User();

        user1.setName("Running Lover");
        user1.setAge(25);

        Running running = new Running(LocalDate.now(), Duration.ofMinutes(45), 2, 3);

        Objective distance = new Objective();
        distance.setTargetDistance(5);
        user1.getObjectiveList().add(distance);
        user1.addWorkout(running);
        userList.add(user1);

        User user2 = new User();

        user2.setName("Weightlifting Lover");
        user2.setAge(25);

        Weightlifting weightlifting = new Weightlifting(LocalDate.now(), Duration.ofMinutes(30), 50, 5, 3);
        Objective weight = new Objective();
        weight.setTargetWeight(75);
        user2.getObjectiveList().add(weight);
        user2.addWorkout(weightlifting);
        userList.add(user2);

        System.out.println(userList);
    }
}