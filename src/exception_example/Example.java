package exception_example;

public class Example extends Exception {

    public Example(String message) {
        super(message);
    }

    public Example(Throwable cause) {
        super(cause);
    }
}

