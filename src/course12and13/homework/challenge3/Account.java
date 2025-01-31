package course12and13.homework.challenge3;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private String accountOwnerName;
    private String accountOwnerSSN;
    private String accountCurrency;
    private double initialBalance;
    private final List<Transaction> transactionList =  new ArrayList<>();

    //deposits;
    public void deposit(double amount) {

        if (amount > 0) {
            this.initialBalance += amount;
            transactionList.add(new Transaction(amount, true));
        } else {
            System.out.println("The amount must be positive.");
        }
    }

    //withdrawals;
    public void withdrawal(double amount) {

        if (amount > 0 && amount <= this.initialBalance){
            this.initialBalance -= amount;
            transactionList.add(new Transaction (amount, false));
        }
    }

    //account balance
    public double checkBalance() {
        return this.initialBalance;
    }

    public void printStatement() {
        System.out.println("Transactions history for: " + accountOwnerName + ":");
        for (Transaction transaction : transactionList) {
            System.out.println(transaction);
        }
    }


    public void setAccountOwnerName(String accountOwnerName) {
        this.accountOwnerName = accountOwnerName;
    }

    public void setAccountOwnerSSN(String accountOwnerSSN) {
        this.accountOwnerSSN = accountOwnerSSN;
    }

    public void setAccountCurrency(String accountCurrency) {
        this.accountCurrency = accountCurrency;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }
}