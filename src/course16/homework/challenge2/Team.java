package course16.homework.challenge2;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private List<Worker> members = new ArrayList<>();
    private String leader;

    public List<Worker> getMembers() {
        return members;
    }

    public void setMembers(List<Worker> members) {
        this.members = members;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }
}