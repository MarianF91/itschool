package course18recap.challenge1;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("RO75", "Savings", 1000.00, 0.1);
        AccountOperations operations = new AccountOperations(bankAccount);
        operations.deposit(900);
        System.out.println(bankAccount.getBalance());
        operations.withdraw(200);
        System.out.println(bankAccount.getBalance());
        operations.interest();
    }
}