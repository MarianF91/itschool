package course14.homework.challenge7;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private String accountHolderName;
    private String accountNumber;
    private double balance;
    private List<String> accountInfo = new ArrayList<>();


    public double getBalance() {
        return balance;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<String> getAccountInfo() {
      accountInfo.add(accountHolderName);
      accountInfo.add(accountNumber);
      accountInfo.add(String.valueOf(balance));
      return accountInfo;
    }

    @Override
    public String toString() {
        return accountHolderName;
    }

}