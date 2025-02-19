package course16.homework.challenge2;

public class TeamLeader extends Employee implements User {

    public TeamLeader(String name, String email) {
        super(name, "Team Leader", email);
    }
}