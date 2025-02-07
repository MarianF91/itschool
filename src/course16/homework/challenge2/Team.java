package course16.homework.challenge2;

import java.util.List;

public class Team {

    private List<Worker> members;
    private TeamLeader leader;

    public Team(List<Worker> members, TeamLeader leader) {
        this.members = members;
        this.leader = leader;
    }
}