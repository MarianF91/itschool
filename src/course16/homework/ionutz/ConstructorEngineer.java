package course16.homework.ionutz;

public final class ConstructorEngineer extends ValuableEmployee implements User {

    public ConstructorEngineer(String name, String email,
                               ConstructionResource constructionResource,
                               ExtraResource extraResource) {
        super(name, email, "Construction Engineer", constructionResource, extraResource);
    }
}
