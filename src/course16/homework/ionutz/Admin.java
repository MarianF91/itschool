package course16.homework.ionutz;

public record Admin(String getName) implements User {

    public static final String ADMIN_ROLE = "Admin";

    @Override
    public String getRole() {
        return ADMIN_ROLE;
    }

}
