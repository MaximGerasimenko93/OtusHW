package lesson3;

import java.util.Scanner;

public class UserEnter {

    private final Scanner scanner;

    public UserEnter(Scanner scanner) {
        // new Scanner(System.in);
        this.scanner = scanner;
    }

    public long getUserAnswer() {
        return scanner.nextLong();
    }
}
