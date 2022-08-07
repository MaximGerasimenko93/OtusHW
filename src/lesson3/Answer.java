package lesson3;

public class Answer {
    private final long id;
    private final String answer;
    private final boolean correctAnswer;

    public Answer(long id, String answer, boolean correctAnswer) {
        this.id = id;
        this.answer = answer;
        this.correctAnswer = correctAnswer;

    }

    public long getId() {
        return id;
    }

    public String getAnswer() {
        return answer;
    }

    public boolean isCorrectAnswer() {
        return correctAnswer;
    }
}
