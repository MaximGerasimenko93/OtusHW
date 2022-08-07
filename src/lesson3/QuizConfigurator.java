package lesson3;

public class QuizConfigurator {

    public Quiz execute() {

        Quiz quiz = new Quiz();
        return quiz;
    }

    public QuestionAnswersHolder questionAnswersHolder1() {
        Answer answer1 = new Answer(1, "1. Стив Джобс", false);
        "1. Стив Джобс", "2. Фрэнсис Бэкон", "3. Томас Гоббс", "4. Оливер Кромвель"
        Answer[] answers1 = new Answer[] {answer1};
        return new QuestionAnswersHolder(0,new Question("Какой английский мыслитель написал книгу 'Левиафан'?"), new Answers())
    }
}
