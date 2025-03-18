package course20and21.challenge7;

import java.sql.Timestamp;
import java.util.Objects;

public class User {
    private final int id;
    private final String name;
    private final Timestamp checkIn;

    public User(int id, String name, Timestamp checkIn) {
        this.id = id;
        this.name = name;
        this.checkIn = checkIn;
    }

    @Override
    public boolean equals(Object object){
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        User user = (User) object;
        return id == user.id;
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }
}

