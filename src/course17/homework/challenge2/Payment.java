package course17.homework.challenge2;

public class Payment {

    private final String paymentMethod;
    private final double paymentAmount;
    private PaymentStatus paymentStatus;

    public Payment(String paymentMethod, double paymentAmounts) {
        this.paymentMethod = paymentMethod;
        this.paymentAmount = paymentAmounts;
        this.paymentStatus = PaymentStatus.PENDING;
    }

    public void processPayment() {
        this.paymentStatus = PaymentStatus.ACCEPTED;
        System.out.println("The payment status has been updated to: " + this.paymentStatus);
    }

    public PaymentStatus getPaymentStatus() {
        return this.paymentStatus;
    }

    public String getPaymentMethod(){
        return this.paymentMethod;
    }
}