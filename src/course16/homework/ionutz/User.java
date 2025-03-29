package course16.homework.ionutz;

public interface User {

    String getName();

    default String getRole() {
        return "User";
    }
}
