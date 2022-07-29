package Lesson2;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        int correctCount = 0, wrongCount = 0;

        String[] questions = new String[4];
        questions[0] = "Какой английский мыслитель написал книгу 'Левиафан'?";
        questions[1] = "Кто ввел прямоугольную систему координат?";
        questions[2] = "Кто является автором романа 'Норма'?";
        questions[3] = "Кто из российских философов говорил о камышовом коте-убийце?";

        String[][] answerOptions = {
                {"1. Стив Джобс", "2. Фрэнсис Бэкон", "3. Томас Гоббс", "4. Оливер Кромвель"},
                {"1. Рене Магритт", "2. Аристотель", "3. Готфрид Лейбниц", "4. Рене Декарт"},
                {"1. Джейн Остин", "2. Владимир Набоков", "3. Виктор Пелевин", "4. Владимир Сорокин"},
                {"1. Алексей Лосев", "2. Николай Бердяев", "3. Лев Гумилев", "4. Александр Дугин"}
        };

        int[] correctAnswers = new int[4];
        correctAnswers[0] = 3;
        correctAnswers[1] = 4;
        correctAnswers[2] = 4;
        correctAnswers[3] = 4;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (int j = 0; j < answerOptions[i].length; j++) {
                System.out.println(answerOptions[i][j]);
            }
            System.out.print("Введите номер ответа от 1 до 4 включительно: ");

            int userAnswer = 0;
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    userAnswer = scanner.nextInt();
                    if (userAnswer > 0 && userAnswer <= answerOptions[i].length) {
                        break;
                    } else {
                        System.out.println("Введите вариант ответов от 1 до 4, пожалуйста");
                        scanner.next();
                    }
                } else {
                    System.out.println("Вы ввели не число");
                    scanner.next();
                }
            }
            if (!(userAnswer == correctAnswers[i])) {
                wrongCount++;
                System.out.println("Ответ неверный, попробуйте снова");
            } else {
                correctCount++;
                System.out.println("Поздравляю! Вы ответили верно");
            }
        }

        System.out.println("Правильных ответов: " + correctCount);
        System.out.println("Неправильных ответов: " + wrongCount);
    }
}










