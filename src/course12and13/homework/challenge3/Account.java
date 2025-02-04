package course12and13.homework.challenge3;

import java.util.ArrayList;
import java.util.List;

public record Account(
        String accountOwnerName,
        String accountOwnerSSN,
        String accountCurrency,
        double initialBalance,
        List<Transaction> transactionList) {

    public Account {
        if (transactionList == null) {
            transactionList = new ArrayList<>();
        }
    }

    public Account deposit(double amount) {
        if (amount > 0) {
            double newBalance = this.initialBalance + amount;
            List<Transaction> newTransactionList = new ArrayList<>(this.transactionList);
            newTransactionList.add(new Transaction(amount, true));
            return new Account(this.accountOwnerName, this.accountOwnerSSN, this.accountCurrency,
                    newBalance, newTransactionList);
        } else {
            System.out.println("The amount must be positive.");
            return this;
        }
    }

    public Account withdrawal(double amount) {
        if (amount > 0 && amount <= this.initialBalance) {
            double newBalance = this.initialBalance - amount;
            List<Transaction> newTransactionList = new ArrayList<>(this.transactionList);
            newTransactionList.add(new Transaction(amount, false));
            return new Account(this.accountOwnerName, this.accountOwnerSSN,
                    this.accountCurrency, newBalance, newTransactionList);
        } else if (amount > 0 && amount > this.initialBalance) {
            System.out.println("Insufficient funds.");
            return this;
        } else {
            System.out.println("Invalid amount.");
            return this;
        }
    }

    public double checkBalance() {
        return this.initialBalance;
    }

    public void printStatement() {
        System.out.println("Transaction history for: " + accountOwnerName +
                "\nOwner SSN: " + accountOwnerSSN +
                "\nAccount Currency: " + accountCurrency +
                "\nTransactions:");

        for (Transaction transaction : transactionList) {
            System.out.println(transaction);
        }
    }
}