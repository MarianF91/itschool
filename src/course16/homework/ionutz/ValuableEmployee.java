package course16.homework.ionutz;

public sealed class ValuableEmployee extends Employee permits ConstructorEngineer, Manager {

    private final ConstructionResource constructionResource;
    private final ExtraResource extraResource;

    public ValuableEmployee(String name, String email, String position, 
                            ConstructionResource constructionResource, ExtraResource extraResource) {
        super(name, email, position);
        this.constructionResource = constructionResource;
        this.extraResource = extraResource;
    }

    public ConstructionResource getConstructionResource() {
        return constructionResource;
    }

    public ExtraResource getExtraResource() {
        return extraResource;
    }
}
