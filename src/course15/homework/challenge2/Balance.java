package course15.homework.challenge2;

public class Balance {

    private final Bank bank;

    public Balance(Bank bank) {
        this.bank = bank;
    }

    public void balance() {
        bank.getBalance();
    }
}