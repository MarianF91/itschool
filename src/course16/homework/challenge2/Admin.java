package course16.homework.challenge2;

public abstract class Admin extends Employee implements User {

    public Admin(String name, String position, String email) {
        super(name, position, email); //to be modified
    }

    abstract void createUser();
    abstract void modifyUser();
    abstract void deleteUser();

}