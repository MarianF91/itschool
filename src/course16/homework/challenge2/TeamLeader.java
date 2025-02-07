package course16.homework.challenge2;

public abstract class TeamLeader extends Worker {

    public TeamLeader(String name, String position, String email) {
        super(name, position, email);
    }

    public void leader() {
        System.out.println(getNAME() + " is leading the team.");
    }
}