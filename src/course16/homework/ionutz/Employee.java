package course16.homework.ionutz;

public class Employee {

    private final String name;
    private final String email;
    private String position;

    protected Employee(String name, String email, String position) {
        this.name = name;
        this.email = email;
        this.position = position;
    }

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
        this.position = "Regular team member";
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}