package course12and13.homework.challenge3;

public final class Transaction {
    private final double amount;
    private final boolean isDeposit;

    public Transaction(double amount, boolean isDeposit) {
        this.amount = amount;
        this.isDeposit = isDeposit;
    }

    @Override
    public String toString() {
        return isDeposit ? "Deposit: " + amount : "Withdrawal: " + amount;
    }
}