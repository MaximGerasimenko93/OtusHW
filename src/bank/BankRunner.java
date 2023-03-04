/**
 * Найти клиента по счету (например Client findClient(Account account) )
 * 1. Создаем HashMap<Account, Client> clients в классе Bank
 * 2. Положить в хранилище clients(Account, Client) public void putClientToTheVault(Account account, Client client)
 * 3. Найти клиента по счету public Client getClientByAccount(Account account)
 */



package bank;

import java.util.ArrayList;
import java.util.List;

public class BankRunner {
    public static void main(String[] args) {
        Bank bank = new Bank(); // Создали экземпляр класса Bank
        Client client = new Client("Ivan", 21); // Создали экземпляр класса Client
        Client client1 = new Client("Sergey", 22); // Создали экземпляр класса Client
        Account account = new Account(112312); // Создали экземпляр класса Account
        Account account1 = new Account(112313); // Создали экземпляр класса Account
        Account account2 = new Account(108456); // Создали экземпляр класса Account

        List<Account> accountsOfClient = new ArrayList<>(); // Создали ArrayList аккаунтов клиента
        accountsOfClient.add(account); // Добавили в ArrayList аккаунт
        accountsOfClient.add(account1); // Добавили в ArrayList аккаунт
        accountsOfClient.add(account2); // Добавили в ArrayList аккаунт

        bank.putDataToBankVault(client, accountsOfClient); // Положили в мапу
        bank.putDataToBankVault(client1, accountsOfClient); // Положили в мапу
        bank.putClientToTheVault(account, client); // Положили клиента в хранилище
        bank.putClientToTheVault(account1, client); // Положили клиента в хранилище
        bank.putClientToTheVault(account2, client1); // Положили клиента1 в хранилище

        List<Account> accountList = bank.getAccountsByClient(client1);
        bank.getClientByAccount(account2);

        System.out.println(bank.getClientByAccount(account2));
        System.out.println(bank.getAccountsByClient(client1));
    }
}
