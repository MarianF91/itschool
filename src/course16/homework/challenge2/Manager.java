package course16.homework.challenge2;

import java.util.List;

public class Manager extends ResourceHandler {

    private final List<Team> teams;

    public Manager(String name, String email, List<Team> teams, ConstructionResource resources) {
        super(name, "Manager", email, resources);
        this.teams = teams;
    }

    public void modifyTeam(Team team, Worker newMember) {
        team.addMember(newMember);
        System.out.println(newMember.getName() + " added to " + team.getLeader().getName() + "'s team.");
    }

    public void changeEmployeePosition(Employee employee, String newPosition) {
        employee.setPosition(newPosition);
        System.out.println(employee.getName() + " position changed to " + newPosition);
    }

     public void sendGeneralAnnouncement(Communications communications, String message) {
        System.out.println("Sending general announcement: " + message);
        for (Team team : teams) {
            for (Worker member : team.getMembers()) {
                communications.sendAnnouncementMessage(member, message);
            }
            communications.sendAnnouncementMessage(team.getEngineer(), message);
            communications.sendAnnouncementMessage(team.getLeader(), message);
        }
    }

    public void viewEmployees() {
        System.out.println("Company's Employees:\n");
        for (Team team : teams) {
            System.out.println("Team Leader: \n" + team.getLeader().getName());
            System.out.println("Team Members:");
            for (Worker member : team.getMembers()) {
                System.out.println("- " + member.getName() + " (" + member.getPosition() + ")");
            }
            System.out.println("Construction Engineer:\n " + team.getEngineer().getName() + "\n");
        }
    }

    @Override
    public void userType() {
        System.out.println("User Type: Manager\n");
    }

    @Override
    public void userInfo() {
        System.out.println("Manager info: " + getName() + " (" + getEmail() + ")\n");
    }
}