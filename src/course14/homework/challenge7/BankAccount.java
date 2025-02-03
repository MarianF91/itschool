package course14.homework.challenge7;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private String accountHolderName;
    private final String accountNumber;
    private double balance;

    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountInfo() {
        return "Account Holder: " + accountHolderName +
                ", Account Number: " + accountNumber +
                ", Balance: " + balance;
    }

    @Override
    public String toString() {
        return accountHolderName;
    }
}