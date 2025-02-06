package course15.homework.challenge1;

public class SecondDeviceNotificationImpl implements Notification{
    @Override
    public void sendMessage() {
        System.out.println("Message sent from second device.");
    }
}
