package lesson3;

public class QuestionAnswersHolder {
    private final long id;
    private final Question question;
    private final Answers answers;

    public QuestionAnswersHolder(long id, Question question, Answers answers) {
        this.id = id;
        this.question = question;
        this.answers = answers;
    }

    public long getId() {
        return id;
    }

    public String getQuestion() {
        return question.getText();
    }

    public Answer[] getAnswers() {
        return answers.getAnswers();
    }

    public boolean isCorrectAnswer(long userAnswerId) {
        return answers.isCorrectAnswers(userAnswerId);
    }
}
