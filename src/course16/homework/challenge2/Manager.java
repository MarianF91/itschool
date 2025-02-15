package course16.homework.challenge2;

import java.util.List;

public class Manager extends Employee implements User {
    private List<Team> teams;
    private ConstructionResource resources;

    public Manager(String name, String email, List<Team> teams, ConstructionResource resources) {
        super(name, "Manager", email);
        this.teams = teams;
        this.resources = resources;
    }

    public void modifyTeam(Team team, Worker newMember) {
        team.addMember(newMember);
        System.out.println(newMember.getName() + " added to " + team.getLeader().getName() + "'s team.");
    }

    public void changeEmployeePosition(Employee employee, String newPosition) {
        employee.setPosition(newPosition);
        System.out.println(employee.getName() + " position changed to " + newPosition);
    }

    public void sendAnnouncement(Communications communications, Employee recipient) {
        communications.sendMessage(recipient);
    }

    public void viewEmployees() {
        System.out.println("Company's Employees:");
        for (Team team : teams) {
            System.out.println("Team Leader: " + team.getLeader().getName());
            System.out.println("Team Members:");
            for (Worker member : team.getMembers()) {
                System.out.println("- " + member.getName() + " (" + member.getPosition() + ")");
            }
            System.out.println("Construction Engineer: " + team.getEngineer().getName() + "\n");
        }
    }

    public void viewConstructionResources() {
        System.out.println("Available Construction Resources:");
        resources.displayResources();
    }
}
