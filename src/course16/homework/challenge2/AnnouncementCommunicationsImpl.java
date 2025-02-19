package course16.homework.challenge2;

public class AnnouncementCommunicationsImpl implements Communications {

    @Override
    public void sendMessage(Employee recipient) {
        System.out.println("\nNew announcement sent from " + recipient.getName() + "\n");
    }

    @Override
    public void sendAnnouncementMessage(Employee recipient, String message) {
        System.out.println("Announcement to " + recipient.getName() + ": " + message);
    }
}