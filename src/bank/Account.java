package bank;

public class Account {

    private int accountNumber;

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "Счет" +
                "Номер счета = " + accountNumber +
                '}';
    }
}
