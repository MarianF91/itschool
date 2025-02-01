package course14.homework.challenge7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        List<BankAccount> accountList = accountCreation();

        transferFunds(accountList.getFirst(), accountList.get(1),1500);
    }

    public static List<BankAccount> accountCreation() {

        List<BankAccount> accountList = new ArrayList<>();
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        Random iban = new Random();
        int length = 24;

        StringBuilder randomIban = new StringBuilder(length);
        for (int i = 0; i < length; i++) {

            int index = iban.nextInt(chars.length());
            randomIban.append(chars.charAt(i));
        }

        BankAccount firstAccount = new BankAccount();
        firstAccount.setAccountHolderName("Jesus");
        firstAccount.setAccountNumber(String.valueOf(randomIban));
        firstAccount.setBalance(3000);
        accountList.add(firstAccount);

        System.out.println(firstAccount.getAccountInfo());

        BankAccount secondAccount = new BankAccount();
        secondAccount.setAccountHolderName("Moses");

        iban = new Random();

        randomIban = new StringBuilder(length);
        for (int i = 0; i < length; i++) {

            int index = iban.nextInt(chars.length());
            randomIban.append(chars.charAt(i));
        }

        secondAccount.setAccountNumber(String.valueOf(randomIban));
        secondAccount.setBalance(0);

        System.out.println(secondAccount.getAccountInfo());
        accountList.add(secondAccount);

        return accountList;
    }

    public static void transferFunds(BankAccount firstAccount,
                                     BankAccount secondAccount,
                                     double amount) {
        amount = 1500;
        System.out.println("\nTransfer " + amount + " from " + firstAccount + " to " + secondAccount);

        firstAccount.setBalance(firstAccount.getBalance() - amount);
        System.out.println("\nNew balance for " + firstAccount + ": " + firstAccount.getBalance());

        secondAccount.setBalance(secondAccount.getBalance() + amount);
        System.out.println("New balance for " + secondAccount + ": " + secondAccount.getBalance());
    }
}