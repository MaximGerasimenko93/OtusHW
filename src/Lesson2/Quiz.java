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


        String[][] answerOptions = new String[4][4];
        answerOptions[0][0] = "1. Стив Джобс";
        answerOptions[0][1] = "2. Фрэнсис Бэкон";
        answerOptions[0][2] = "3. Томас Гоббс";
        answerOptions[0][3] = "4. Оливер Кромвель";
        answerOptions[1][0] = "1. Рене Магритт";
        answerOptions[1][1] = "2. Аристотель";
        answerOptions[1][2] = "3. Готфрид Лейбниц";
        answerOptions[1][3] = "4. Рене Декарт";
        answerOptions[2][0] = "1. Джейн Остин";
        answerOptions[2][1] = "2. Владимир Набоков";
        answerOptions[2][2] = "3. Виктор Пелевин";
        answerOptions[2][3] = "4. Владимир Сорокин";
        answerOptions[3][0] = "1. Алексей Лосев";
        answerOptions[3][1] = "2. Николай Бердяев";
        answerOptions[3][2] = "3. Лев Гумилев";
        answerOptions[3][3] = "4. Александр Дугин";

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
            System.out.print("Ваш ответ: ");
            while (scanner.hasNextInt()) {
                int x = scanner.nextInt();
                if (!(x == correctAnswers[i])) {
                    wrongCount++;
                    System.out.println("Ответ неверный, попробуйте снова");
                } else {
                    correctCount++;
                    System.out.println("Поздравляю! Вы ответили верно");
                }
            }
        }
    }
}









