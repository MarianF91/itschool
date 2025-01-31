package course12and13.homework.challenge3;

public class Main {

    public static void main(String[] args) {

    accountStatement();

    }

    public static void accountStatement() {

        Account account = new Account();
        account.setAccountOwnerName("Richie Rich");
        account.setAccountOwnerSSN("12345678");
        account.setAccountCurrency("USD");
        account.setInitialBalance(200);

        account.deposit(1);
        account.withdrawal(10);
        account.deposit(100);
        account.withdrawal(1000);

        System.out.println("Current account balance: " + account.checkBalance());
        account.printStatement();
    }
}