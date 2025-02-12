package course16.homework.challenge2;

public class AnnouncementCommunicationsImpl implements Communications{

    @Override
    public void sendMessage(Employee recipient) {
        System.out.println("New announcement sent to " + recipient.getName());
    }
}