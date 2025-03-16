package course20and21.challenge7;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Timestamp timestamp = Timestamp.valueOf(LocalDateTime.now());
        User user1 = new User(123, "User", timestamp);
        User user2 = new User(234, "User", timestamp);

        System.out.println("Are objects equal? " + user1.equals(user2));
    }
}
