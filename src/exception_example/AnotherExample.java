package exception_example;

public class AnotherExample {

    public AnotherExample() {
    }

    // создаем метод, который выбрасывает Runtime исключение
    public void makeUnsafeSituation() {
        throw new RuntimeException("This is unsafe situation. Please sit and cry :)");
    }
}
