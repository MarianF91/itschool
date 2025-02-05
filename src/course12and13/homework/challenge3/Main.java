package course12and13.homework.challenge3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        accountStatement();
    }

    public static void accountStatement() {
        Account account = new Account("Richie Rich", "12345678",
                "USD", 200, new ArrayList<>());

        account = account.deposit(1).withdrawal(10).deposit(100).withdrawal(1000);

        System.out.println("Current account balance: " + account.checkBalance());
        account.printStatement();
    }
}