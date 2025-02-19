package course16.homework.challenge2;

public abstract class ResourceHandler extends Employee implements User {

    protected ConstructionResource resources;

    public ResourceHandler(String name, String position, String email, ConstructionResource resources) {
        super(name, position, email);
        this.resources = resources;
    }

    public void viewConstructionResources() {
        System.out.println("Available Construction Resources:\n");
        resources.displayResources();
    }

    public abstract void modifyConstructionResources();
}
