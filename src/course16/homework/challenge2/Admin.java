package course16.homework.challenge2;

public class Admin extends Employee implements User {

    public Admin(String name, String email) {
        super(name, "System Administrator", email); //to be modified
    }

    void createUser() {
        System.out.println("User created.");
    }

    void modifyUser() {
        System.out.println("User modified.");
    }

    void deleteUser() {
        System.out.println("User deleted.");
    }

}