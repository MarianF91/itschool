package course16.homework.challenge2;

public class ConstructionEngineer extends Employee implements User {

    private ConstructionResource resources;

    public ConstructionEngineer(String name, String email, ConstructionResource resources) {
        super(name, "Construction Engineer", email);
        this.resources = resources;
    }

    public void viewConstructionResources() {
        System.out.println("Available Construction Resources:");
        resources.displayResources();
    }
}