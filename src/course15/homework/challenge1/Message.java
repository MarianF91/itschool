package course15.homework.challenge1;

public class Message {

    private final Notification notification;

    public Message(Notification notification) {
        this.notification = notification;
    }

    public void message() {

    notification.sendMessage();
    }
}