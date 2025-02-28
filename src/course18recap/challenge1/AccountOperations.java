package course18recap.challenge1;

public record AccountOperations(BankAccount account) {

    public void deposit(double amount) {
        double currentBalance = account.getBalance();

        if (amount < 0) {
            System.out.println("You cannot deposit a negative value.");
        } else {
            currentBalance += amount;
            account.setBalance(currentBalance);
        }
    }

    public void withdraw(double amount) {
        double currentBalance = account.getBalance();

        if (amount > currentBalance) {
            System.out.println("Insufficient funds.");
        } else {
            currentBalance -= amount;
            account.setBalance(currentBalance);
        }
    }

    public void interest() {
        double interest = account().getBalance() * account.getInterestRate();
        System.out.println("Interest is: " + (interest - (interest * 0.1)));
    }
}