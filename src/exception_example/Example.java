package exception_example;


// Наследуем класс Exception
public class Example extends Exception {

    // Создаем конструктор для отправки сообщения
    public Example(String message) {
        super(message);
    }

    // Создаем конструктор для проброса причины исключения
    public Example(Throwable cause) {
        super(cause);
    }
}

