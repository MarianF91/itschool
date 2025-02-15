package course16.homework.challenge2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Admin admin = createAdmin();
        displayAdmin(admin);

        List<Team> teams = getTeams();
        ConstructionResource resources = createConstructionResources();
        Manager manager = createManager(teams, resources);

        displayManager(manager);

        displayTeams(teams);

        manager.viewEmployees();
        manager.viewConstructionResources();

        AnnouncementCommunicationsImpl communications = new AnnouncementCommunicationsImpl();
        communications.sendMessage(manager);
    }

    public static List<Team> getTeams() {
        List<Worker> firstTeam = new ArrayList<>();
        Worker worker1 = new Worker("Employee1", "Worker", "emp1@constructioncompany.com");
        Worker worker2 = new Worker("Employee2", "Worker", "emp2@constructioncompany.com");
        TeamLeader tl1 = new TeamLeader("Employee3", "emp3@constructioncompany.com");

        firstTeam.add(worker1);
        firstTeam.add(worker2);

        List<Worker> secondTeam = new ArrayList<>();
        Worker worker3 = new Worker("Employee4", "Worker", "emp4@constructioncompany.com");
        Worker worker4 = new Worker("Employee5", "Worker", "emp5@constructioncompany.com");
        TeamLeader tl2 = new TeamLeader("Employee6", "emp6@constructioncompany.com");

        secondTeam.add(worker3);
        secondTeam.add(worker4);

        ConstructionResource resources = new ConstructionResource();
        resources.setCementBags(500);
        resources.setBricks(1000);
        resources.setSteel(5000);
        resources.setWood(200);
        resources.setSandstone(500);
        resources.setFaience(500);
        resources.setPaint(1000);

        ConstructionEngineer engineer = new ConstructionEngineer("Employee7", "emp7@constructioncompany.com", resources);

        Team team1 = new Team(firstTeam, tl1, engineer);
        Team team2 = new Team(secondTeam, tl2, engineer);

        List<Team> fullTeam = new ArrayList<>();
        fullTeam.add(team1);
        fullTeam.add(team2);

        return fullTeam;
    }

    public static void displayTeams(List<Team> teams) {
        for (Team team : teams) {
            System.out.println("Team Leader: " + team.getLeader().getName());
            System.out.println("Team Members:");
            for (Worker member : team.getMembers()) {
                System.out.println("- " + member.getName() + " (" + member.getPosition() + ")");
            }
            System.out.println("Construction Engineer: " + team.getEngineer().getName());
            System.out.println("=============");
        }
    }

    public static Admin createAdmin() {
        return new Admin("Jarvis", "admin@constructioncompany.com");
    }

    public static void displayAdmin(Admin admin) {
        System.out.println("System Administrator: " + admin.getName() + " - Email: " + admin.getEmail());
        System.out.println("================");
    }

    public static Manager createManager(List<Team> teams, ConstructionResource resources) {
        return new Manager("The Guy In The Big Chair", "manager@constructioncompany.com", teams, resources);
    }

    public static void displayManager(Manager manager) {
        System.out.println("Manager Name: " + manager.getName() + " - Email: " + manager.getEmail());
        System.out.println("============");
    }

    public static ConstructionResource createConstructionResources() {
        ConstructionResource resources = new ConstructionResource();
        resources.setCementBags(500);
        resources.setBricks(1000);
        resources.setSteel(5000);
        resources.setWood(200);
        resources.setSandstone(500);
        resources.setFaience(500);
        resources.setPaint(1000);
        return resources;
    }
}