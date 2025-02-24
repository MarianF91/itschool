package course17.homework.challenge2;

public class Payment {

    private double paymentAmount;
    private String paymentStatus;

    public Payment() {
        this.paymentAmount = paymentAmount;
        this.paymentStatus = "Pending";
    }

    public void processPayment() {
        this.paymentStatus = "Completed";
        System.out.println("The payment status has been update to: " + this.paymentStatus);
    }
}