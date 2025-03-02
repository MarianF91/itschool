package course16.homework.ionutz;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // create some objects to play with
        List<Team> teams = getTeams();

        ConstructionResource constructionResource = new ConstructionResource();
        constructionResource.setBricks(100);

        ExtraResource extraResource = new ExtraResource(1000, true);
        ConstructorEngineer constructorEngineer = new ConstructorEngineer("constr eng", "constr.eng@building.it", constructionResource, extraResource);

        Manager manager = new Manager("some manager", "manager@building.it", teams, constructionResource, extraResource);

        Admin admin = new Admin("Ionutz");
        Application application = new Application(admin, new EmailServiceImpl(), constructorEngineer, manager);

        administrateApplication(application);
    }

    private static List<Team> getTeams() {
        Employee employee1 = new Employee("empl1", "emp1@building.it");
        Employee employee2 = new Employee("empl2", "emp2@building.it");
        List<Employee> employeeList1 = new ArrayList<>();
        employeeList1.add(employee1);
        employeeList1.add(employee2);

        TeamLead teamLead1 = new TeamLead("TL1", "tl1@building.it");
        return getTeams(employeeList1, teamLead1);
    }

    private static List<Team> getTeams(List<Employee> employeeList1, TeamLead teamLead1) {
        Team team1 = new Team("team1", employeeList1, teamLead1);

        Employee employee3 = new Employee("empl3", "emp3@building.it");
        Employee employee4 = new Employee("empl4", "emp4@building.it");
        List<Employee> employeeList2 = new ArrayList<>();
        employeeList2.add(employee3);
        employeeList2.add(employee4);

        TeamLead teamLead2 = new TeamLead("TL2", "tl2@building.it");
        Team team2 = new Team("team1", employeeList2, teamLead2);
        List<Team> teams = new ArrayList<>();
        teams.add(team1);
        teams.add(team2);
        return teams;
    }

    private static void administrateApplication(Application application) {
        application.run();

        managePeople(application);
        audit(application);

        application.makeCompanyAnnouncement("You get a salary increase! Haha, just kidding! :D");
    }

    private static void managePeople(Application application) {
        Manager manager = application.getManager();
        Team team = manager.getTeams().getLast();
        Employee employee = team.getEmployees().getFirst();

        System.out.println("Current team: " + team.getEmployees());
        System.out.println("Current TL: " + team.getTeamLead());

        manager.changeTeamLead(team, employee);
        System.out.println("New team: " + team.getEmployees());
        System.out.println("New TL: " + team.getTeamLead());

        Employee formerTL = null;
        for (Employee teamMember: team.getEmployees()) {
            if ("TL2".equals(teamMember.getName())) {
                formerTL = teamMember;
                break;
            }
        }

        if (formerTL != null) {
            manager.fireEmployee(team, formerTL); // you are fired!
        }
        System.out.println("New team after firing the former TL: " + team.getEmployees());
    }

    private static void audit(Application application) {
        ConstructorEngineer constructorEngineer = application.getConstructorEngineer();
        System.out.println("ConstructorEngineer wants to see how many bricks are used for the house: " + constructorEngineer.getConstructionResource().getBricks());

        System.out.println("Also manager wants to see the total bricks: " + application.getManager().getConstructionResource().getBricks());

        System.out.println("Do manager and constructor engineer know the same amount of bricks? " +
                (application.getManager().getConstructionResource().getBricks() == constructorEngineer.getConstructionResource().getBricks()));
    }
}
