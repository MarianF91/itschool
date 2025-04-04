package course16.homework.ionutz;

public class EmailServiceImpl implements EmailService {

    @Override
    public void sendEmail(String emailAddress, String message) {
        System.out.println("Sending email to: " + emailAddress + " with the following message: " + message);
    }
}
