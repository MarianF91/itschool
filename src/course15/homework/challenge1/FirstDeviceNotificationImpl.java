package course15.homework.challenge1;

public class FirstDeviceNotificationImpl implements  Notification{
    @Override
    public void sendMessage() {
        System.out.println("Message sent from first device.");
    }
}
