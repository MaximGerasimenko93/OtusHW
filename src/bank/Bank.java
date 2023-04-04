package bank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Bank {
    private int coin;
    private Map<Client, List<Account>> accounts = new HashMap<>();
    private Map<Account, Client> clients = new HashMap<>();

    public Bank(int coin) {
        this.coin = coin;
    }

    public Bank() {

    }

    public List<Account> getAccountsByClient(Client client) { // Метод принимает клиента и возвращает список его аккаунтов
        List<Account> accountList = accounts.get(client);
        return accountList;
    }

    public Client getClientByAccount(Account account) {
        return clients.get(account);
    }

    public void putDataToBankVault(Client client, List<Account> accountList) {
        accounts.put(client, accountList);
    }

    public void putClientToTheVault(Account account, Client client) {
        clients.put(account, client);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return coin == bank.coin && Objects.equals(accounts, bank.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coin, accounts);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "coin=" + coin +
                ", accounts=" + accounts +
                '}';
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }
}
