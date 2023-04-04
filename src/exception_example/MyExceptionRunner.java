package exception_example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyExceptionRunner {

    public static void main(String[] args) {

        AnotherExample anotherExample = new AnotherExample();
        anotherExample.makeUnsafeSituation();


        try {
            anotherExample.makeUnsafeSituation();
        } catch (RuntimeException exception1) {
            System.out.println("I've got you, exception!");
            try {
                throw new Example(exception1);
            } catch (Example e) {
                throw new RuntimeException(e);
            }
        }

        try {
            incorrectBehavior();
        } catch (Example exception) {
            System.out.println();
            System.out.println(exception.getMessage());
            System.out.println(exception.getCause());
            exception.printStackTrace();
        }
    }

    public static void closeResources() {
        try (FileReader fileReader = new FileReader("empty path")) {
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void incorrectBehavior() throws Example {
        throw new Example(new RuntimeException("It's a strange behavior in the code. Please do anything!"));
    }
}
