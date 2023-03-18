package bank;

import java.util.Objects;

public class Account {

    private int accountNumber;

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "Счет" +
                "Номер счета = " + accountNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accountNumber == account.accountNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
