package course16.homework.challenge2;

public class Employee implements User{

    private String name;
    private String position;
    private String email;

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