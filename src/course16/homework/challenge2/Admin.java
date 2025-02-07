package course16.homework.challenge2;

public abstract class Admin implements User {

    private final String NAME;
    private final String EMAIL;
    private final String POSITION;

    protected Admin(String name, String email, String position) {
        NAME = name;
        EMAIL = email;
        POSITION = position;
    }

    abstract void createUser();
    abstract void modifyUser();
    abstract void deleteUser();

    public String getNAME() {
        return NAME;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public String getPOSITION() {
        return POSITION;
    }

    @Override
    public void userType() {
        System.out.println("This is an app admin.");
    }

    @Override
    public void userInfo() {
        System.out.println("User info: " + getNAME() + ", " + getPOSITION() + ", " + getEMAIL());
    }
}