package lesson3;

public class Answers {
    private final Answer[] answers;

    public Answers(Answer[] answers) {
        this.answers = answers;
    }



    public Answer[] getAnswers() {
        return answers;
    }

    public boolean isCorrectAnswers(long userAnswerId) {

        for (Answer answer : answers) {
            if (answer.getId() == userAnswerId) {
              return answer.isCorrectAnswer();
            }
        }

        return false;
    }
}
