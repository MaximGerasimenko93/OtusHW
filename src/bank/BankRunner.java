package bank;

import java.util.ArrayList;
import java.util.List;

public class BankRunner {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Client client = new Client("Ivan", 21);
        Client client1 = new Client("Sergey", 22);
        Client client2 = new Client("Vasyliy", 17);
        Account account = new Account(112312);
        Account account1 = new Account(112313);
        Account account2 = new Account(108456);
        Account account3 = new Account(987543);

        List<Account> accountsOfClient = new ArrayList<>();
        accountsOfClient.add(account);
        accountsOfClient.add(account1);

        List<Account> accountsOfClient1 = new ArrayList<>();
        accountsOfClient1.add(account2);

        List<Account> accountsOfClient2 = new ArrayList<>();
        accountsOfClient2.add(account3);

        bank.putDataToBankVault(client, accountsOfClient);
        bank.putDataToBankVault(client1, accountsOfClient1);
        bank.putDataToBankVault(client2, accountsOfClient2);
        bank.putClientToTheVault(account, client);
        bank.putClientToTheVault(account1, client);
        bank.putClientToTheVault(account2, client1);
        bank.putClientToTheVault(account3, client2);

        System.out.println(bank.getClientByAccount(account3));
        System.out.println(bank.getAccountsByClient(client2));
        System.out.println(client1.giveNotification());
    }
}
