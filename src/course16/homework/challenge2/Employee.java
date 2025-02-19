package course16.homework.challenge2;

public class Employee implements User {

    private final String name;
    private String position;
    private final String email;

    public Employee(String name, String position, String email) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (position == null || position.trim().isEmpty()) {
            throw new IllegalArgumentException("Position cannot be null or empty");
        }
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("Email cannot be null or empty");
        }
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

    public void setPosition(String position) {
        this.position = position;
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