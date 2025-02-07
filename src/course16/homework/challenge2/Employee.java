package course16.homework.challenge2;

public class Employee implements User{

    private final String name;
    private final String position;
    private final String email;

    public Employee(String name, String position, String email) {
        this.name = name;
        this.position = position;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void userType() {
        System.out.println("This is a " + getPosition() + ".");
    }

    @Override
    public void userInfo() {
        System.out.println("User info: " + getName() + ", " + getPosition() + ", " + getEmail());
    }
}