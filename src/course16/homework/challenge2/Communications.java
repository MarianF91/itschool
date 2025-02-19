package course16.homework.challenge2;

public interface Communications {
    void sendMessage(Employee recipient);
    void sendAnnouncementMessage(Employee recipient, String message);
}