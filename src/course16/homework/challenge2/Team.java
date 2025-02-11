package course16.homework.challenge2;

import java.util.List;

public class Team {

    private List<Worker> members;
    private TeamLeader leader;
    private ConstructionEngineer engineer;

    public Team(List<Worker> members, TeamLeader leader, ConstructionEngineer engineer) {
        this.members = members;
        this.leader = leader;
        this.engineer = engineer;
    }

    public ConstructionEngineer getEngineer() {
        return engineer;
    }

    public void addMember(Worker newMember) {
        members.add(newMember);
    }

    public TeamLeader getLeader() {
        return leader;
    }

    public List<Worker> getMembers() {
        return members;
    }
}