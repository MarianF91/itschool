package course16.homework.ionutz;

import java.util.List;

public final class Manager extends ValuableEmployee implements User {

    private final List<Team> teams;

    public Manager(String name, String email, List<Team> teams,
                   ConstructionResource constructionResource,
                   ExtraResource extraResource) {
        super(name, email, "Manager", constructionResource, extraResource);
        this.teams = teams;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public List<Team> getTeams() {
        return teams;
    }



    public void addTeamMember(Team team, Employee employee) {
        team.getEmployees().add(employee);
    }

    public void fireEmployee(Team team, Employee employee) {
        team.getEmployees().remove(employee);
    }

    public void changeTeamLead(Team team, Employee promotedToTeamLead) {
        Employee currentTeamLead = team.getTeamLead();
        currentTeamLead.setPosition("Regular team member");
        addTeamMember(team, currentTeamLead); // downgraded to regular team member

        team.getEmployees().remove(promotedToTeamLead); // remove it from regular team members
        team.setTeamLead(new TeamLead(promotedToTeamLead.getName(), promotedToTeamLead.getEmail())); // promote it to team lead
    }

    // other actions manager can do
}
