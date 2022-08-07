package lesson3;

public class CorrectCounter {
    private long correctCounter = 0;
    private long wrongCounter = 0;

    public void incrementCorrectCounter() {
        this.correctCounter++;

    }

    public void incrementWrongCounter() {
        this.wrongCounter++;
    }

    public long getCorrectCounter() {
        return correctCounter;
    }

    public long getWrongCounter() {
        return wrongCounter;
    }
}
