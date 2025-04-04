package course16.homework.ionutz;

import java.util.ArrayList;
import java.util.List;

public class Application {

    private final User user;
    private final EmailService emailService;
    private ConstructorEngineer constructorEngineer;
    private Manager manager;

    private boolean isRunning;

    public Application(User user,
                       EmailService emailService,
                       ConstructorEngineer constructorEngineer,
                       Manager manager) {
        this.user = user;
        this.emailService = emailService;
        this.constructorEngineer = constructorEngineer;
        this.manager = manager;
    }

    public void run() {
        if (isRunning) {
            System.out.println("App already running. Started by user: " + user.getName());
        } else {
            if (user == null) {
                System.out.println("Cannot start app. No user available");
                System.exit(404);
            }

            System.out.println("Starting application by user: " + user.getName());
            if (Admin.ADMIN_ROLE.equals(user.getRole())) {
                System.out.println("OK. User has admin role.");
                isRunning = true;
            } else {
                System.out.println("User does not have admin role! Now stopping the app.");
                System.exit(1);
            }
        }
    }

    private void checkRunningApp() {
        if (!isRunning) {
            System.out.println("Application not running! Cannot modify anything.");
            System.exit(1);
        }
    }

    public void makeCompanyAnnouncement(String message) {
        checkRunningApp();
        List<Employee> allEmployees = new ArrayList<>();
        allEmployees.add(constructorEngineer);
        allEmployees.add(manager);

        List<Team> teams = manager.getTeams();
        for (Team team : teams) {
            allEmployees.addAll(team.getEmployees());
            allEmployees.add(team.getTeamLead());
        }

        for (Employee employee : allEmployees) {
            emailService.sendEmail(employee.getEmail(), message);
        }
    }

    public ConstructorEngineer getConstructorEngineer() {
        checkRunningApp();
        return constructorEngineer;
    }

    public void setConstructorEngineer(ConstructorEngineer constructorEngineer) {
        checkRunningApp();
        this.constructorEngineer = constructorEngineer;
    }

    public Manager getManager() {
        checkRunningApp();
        return manager;
    }

    public void setManager(Manager manager) {
        checkRunningApp();
        this.manager = manager;
    }
}
