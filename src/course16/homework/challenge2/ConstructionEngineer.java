package course16.homework.challenge2;

public abstract class ConstructionEngineer implements User{

    private final String NAME;
    private final String POSITION;
    private final String EMAIL;

    public ConstructionEngineer(String name, String position, String email) {
        NAME = name;
        POSITION = position;
        EMAIL = email;
    }

    public String getNAME() {
        return NAME;
    }

    public String getPOSITION() {
        return POSITION;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    @Override
    public void userType() {
        System.out.println("This is a construction engineer.");
    }

    @Override
    public void userInfo() {
        System.out.println("User info: " + getNAME() + ", " + getPOSITION() + ", " + getEMAIL());
    }
}