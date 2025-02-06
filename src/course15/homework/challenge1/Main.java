package course15.homework.challenge1;

public class Main {

    public static void main(String[] args) {

        Message message1 = new Message(new FirstDeviceNotificationImpl());
        message1.message();

        Message message2 = new Message(new SecondDeviceNotificationImpl());
        message2.message();
    }
}