package course18recap.challenge1;

public class BankAccount {

    /*Create a Bank Account class that has the following attributes: account number,
     account type, balance, and interest rate. Implement methods for depositing and withdrawing money,
      calculating interest, and displaying the account information.
     */

    private  final String accountNumber;
    private final String accountType;
    private double balance;
    private double interestRate;

    public BankAccount(String accountNumber,
                       String accountType,
                       double balance,
                       double interestRate) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}