package exception_example;

/**
 * Придумать несколько взаимосвязанных классов,
 * в которых можно использовать три способа обработки исключений (вывод ошибки, rethrow и еще один, на выбор)
 * А так же использована конструкция try-with-resource
 * Вместо обращения к реальным ресурсам можно использовать классы-заглушки
 * Результатом выполнения задания является код на гитхабе оформленный в виде pull request.
 */

public class MyExceptionRunner {

    public static void main(String[] args) {

        // Создаем экземпляр AnotherExample
        AnotherExample anotherExample = new AnotherExample();
        // Оборачиваем в блок try catch
        try {
            anotherExample.makeUnsafeSituation();
        } catch (RuntimeException exception1) { // ловим exception1 и выводим сообщение
            System.out.println("I've got you, exception!");
            try {
                throw new Example(exception1);
            } catch (Example e) {
                throw new RuntimeException(e);
            } // вот тут запутался что я делаю.
        }

        try {
            incorrectBehavior();
        } catch (Example exception) {
            System.out.println(); // просто пустая строка
            System.out.println(exception.getMessage());
            System.out.println(exception.getCause());
            exception.printStackTrace();
        }
    }

    // создаем метод, который ничего не возвращает, но пробрасывает наше исключение
    public static void incorrectBehavior() throws Example {
        // Оборачиваем наше исключение другим исключением
            throw new Example(new RuntimeException("It's a strange behavior in the code. Please do anything!"));
    }
}
