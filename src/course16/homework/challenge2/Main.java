package course16.homework.challenge2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Admin admin = createAdmin();
        displayAdmin(admin);

        Manager manager = createManager();
        displayManager(manager);

        List<Team> teams = getTeams();
        displayTeams(teams);

        manager.viewEmployees(teams);

        ConstructionResource resources = createConstructionResources();
        manager.viewConstructionResources(resources);

        AnnouncementCommunicationsImpl communications = new AnnouncementCommunicationsImpl();
        communications.sendMessage(manager);
    }

    public static List<Team> getTeams() {
        List<Worker> firstTeam = new ArrayList<>();
        Worker worker1 = new Worker("Employee1", "Worker", "emp1@constructioncompany.com");
        Worker worker2 = new Worker("Employee2", "Worker", "emp2@constructioncompany.com");
        TeamLeader tl1 = new TeamLeader("Employee3", "Team Leader", "emp3@constructioncompany.com");

        firstTeam.add(worker1);
        firstTeam.add(worker2);

        List<Worker> secondTeam = new ArrayList<>();
        Worker worker3 = new Worker("Employee4", "Worker", "emp4@constructioncompany.com");
        Worker worker4 = new Worker("Employee5", "Worker", "emp5@constructioncompany.com");
        TeamLeader tl2 = new TeamLeader("Employee6", "Team Leader", "emp6@constructioncompany.com");

        secondTeam.add(worker3);
        secondTeam.add(worker4);

        ConstructionEngineer engineer = new ConstructionEngineer("Employee7", "Construction Engineer",
                "emp7@constructioncompany.com");

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

    public static Manager createManager() {
        return new Manager("The Guy In The Big Chair", "manager@constructioncompany.com");
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

    public static void displayConstructionResources(ConstructionResource resources) {
        System.out.println("Construction Resources:");
        resources.displayResources();
        System.out.println("==========");
    }

}