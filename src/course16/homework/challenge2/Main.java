package course16.homework.challenge2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Admin admin = createAdmin();
        displayAdmin(admin);

        admin.createUser();
        admin.modifyUser();
        admin.deleteUser();

        List<Team> teams = getTeams();
        ConstructionResource resources = createConstructionResources();
        Manager manager = createManager(teams, resources);

        displayManager(manager);

        displayTeams(teams);

        manager.viewEmployees();
        manager.viewConstructionResources();

        manager.userType();
        manager.userInfo();

        ConstructionEngineer engineer = getConstructionEngineer(resources);
        engineer.viewConstructionResources();
        engineer.modifyConstructionResources();

        engineer.userType();
        engineer.userInfo();

        AnnouncementCommunicationsImpl communications = new AnnouncementCommunicationsImpl();
        communications.sendMessage(manager);

        manager.sendGeneralAnnouncement(communications, "Important message for all employees: I found my sock!\n");

        Worker newWorker = new Worker("Jesus", "Christ", "religion4u@constructioncompany.com");
        manager.modifyTeam(teams.getFirst(), newWorker);
        manager.changeEmployeePosition(newWorker, "Saviour");
    }

    public static List<Team> getTeams() {
        List<Worker> firstTeam = new ArrayList<>();
        Worker worker1 = new Worker("Employee1", "Worker", "emp1@constructioncompany.com\n");
        Worker worker2 = new Worker("Employee2", "Worker", "emp2@constructioncompany.com\n");
        TeamLeader tl1 = new TeamLeader("Employee3", "emp3@constructioncompany.com\n");

        firstTeam.add(worker1);
        firstTeam.add(worker2);

        List<Worker> secondTeam = new ArrayList<>();
        Worker worker3 = new Worker("Employee4", "Worker", "emp4@constructioncompany.com\n");
        Worker worker4 = new Worker("Employee5", "Worker", "emp5@constructioncompany.com\n");
        TeamLeader tl2 = new TeamLeader("Employee6",  "emp6@constructioncompany.com\n");

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

        ConstructionEngineer engineer = new ConstructionEngineer("Employee7", "emp7@constructioncompany.com\n", resources);

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

    public static ConstructionEngineer getConstructionEngineer(ConstructionResource resources) {
        return new ConstructionEngineer("Employee7", "emp7@constructioncompany.com", resources);
    }
}
