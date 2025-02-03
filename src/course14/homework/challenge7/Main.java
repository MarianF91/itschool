package course14.homework.challenge7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        List<BankAccount> accountList = accountCreation();

        transferFunds(accountList.getFirst(), accountList.get(1));
    }

    public static List<BankAccount> accountCreation() {

        List<BankAccount> accountList = new ArrayList<>();
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random iban = new Random();

        BankAccount firstAccount = createAccount("Jesus", iban, chars, 3000);
        accountList.add(firstAccount);

        BankAccount secondAccount = createAccount("Moses", iban, chars, 0);
        accountList.add(secondAccount);

        return accountList;
    }

    private static BankAccount createAccount(String holderName, Random iban, String chars, double initialBalance) {
        StringBuilder randomIban = new StringBuilder();
        for (int i = 0; i < 24; i++) {
            int index = iban.nextInt(chars.length());
            randomIban.append(chars.charAt(index));
        }
        return new BankAccount(holderName, String.valueOf(randomIban), initialBalance);
    }

    public static void transferFunds(BankAccount firstAccount,
                                     BankAccount secondAccount) {
        double amount = 1500;
        System.out.println("\nTransfer " + amount + " from " + firstAccount + " to " + secondAccount);

        firstAccount.setBalance(firstAccount.getBalance() - amount);
        System.out.println("\nNew balance for " + firstAccount + ": " + firstAccount.getBalance());

        secondAccount.setBalance(secondAccount.getBalance() + amount);
        System.out.println("New balance for " + secondAccount + ": " + secondAccount.getBalance());
    }
}