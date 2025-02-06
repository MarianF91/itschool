package course15.homework.challenge2;

public class Main {

    public static void main(String[] args) {

        Balance bank1 = new Balance(new BankABankImpl());
        bank1.balance();

        Balance bank2 = new Balance(new BankBBankImpl());
        bank2.balance();

        Balance bank3 = new Balance(new BankCBankImpl());
        bank3.balance();
    }
}