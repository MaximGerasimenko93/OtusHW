package lesson3;

import java.util.Scanner;

public class QuizRunner {
    QuizConfigurator quizConfigurator;


    public void main(String[] args) {
        Quiz quiz = quizConfigurator.execute();
        quiz.run();
    }
}



