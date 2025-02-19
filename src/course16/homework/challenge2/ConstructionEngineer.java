package course16.homework.challenge2;

public class ConstructionEngineer extends ResourceHandler {

    public ConstructionEngineer(String name, String email, ConstructionResource resources) {
        super(name, "Construction Engineer", email, resources);
    }

    @Override
    public void modifyConstructionResources() {
        System.out.println("\nResources modified.\n");
    }
}