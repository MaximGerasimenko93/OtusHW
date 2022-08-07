package lesson3;

public class Quiz {
    private final QuestionAnswersHolder[] questionAnswersHolders;
    private final UserEnter userEnter;
    private final MessageSender messageSender;
    private final CorrectCounter correctCounter;

    public Quiz(QuestionAnswersHolder[] questionAnswersHolders, UserEnter userEnter, MessageSender messageSender, CorrectCounter correctCounter) {
        this.questionAnswersHolders = questionAnswersHolders;
        this.userEnter = userEnter;
        this.messageSender = messageSender;
        this.correctCounter = correctCounter;
    }

    public void run() {

        for (QuestionAnswersHolder questionAnswersHolder : questionAnswersHolders) {

            messageSender.send(questionAnswersHolder.getQuestion());
            for (Answer answer : questionAnswersHolder.getAnswers()) {
                messageSender.send(answer.getAnswer());
            }
            messageSender.send("Введите номер ответа от 1 до 4 включительно: ");

            boolean userAnswerResult = questionAnswersHolder.isCorrectAnswer(userEnter.getUserAnswer());
            if (userAnswerResult) {
                correctCounter.incrementCorrectCounter();
            } else {
                correctCounter.incrementWrongCounter();
            }
            messageSender.send("Правильных ответов: " + correctCounter.getCorrectCounter());
            messageSender.send("Неправильных ответов: " + correctCounter.getWrongCounter());
        }
    }
}
