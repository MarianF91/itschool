package course16.homework.ionutz;

import java.util.List;

public class Team {

    private final String name;
    private List<Employee> employees;
    private TeamLead teamLead;

    public Team(String name, List<Employee> employees, TeamLead teamLead) {
        this.name = name;
        this.employees = employees;
        this.teamLead = teamLead;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public TeamLead getTeamLead() {
        return teamLead;
    }

    public void setTeamLead(TeamLead teamLead) {
        this.teamLead = teamLead;
    }
}
