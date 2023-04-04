package bank;

import java.util.Objects;

public class Client implements Able {

    private String name;
    private int age;

    public Client(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean isAdult() {
        return age < 18;
    }

    public String giveNotification() {
        if (isAdult() == true) {
            return "Вы можете снять со своего счета только сумму в размере 1000 монет";
        } else {
            return "Вам доступны все операции банка";
        }
    }

    @Override
    public String toString() {
        return "Клиент: " +
                "Имя: '" + name + '\'' +
                ", возраст = " + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return age == client.age && Objects.equals(name, client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
