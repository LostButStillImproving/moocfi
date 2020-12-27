package ChapterFive.One;

public class Timer {

    private ClockHand hundredthsOfSecond;
    private ClockHand seconds;

    public Timer() {
        this.hundredthsOfSecond = new ClockHand(100);
        this.seconds = new ClockHand(50);
    }

    public void advance() {
        this.hundredthsOfSecond.advance();

        if (this.hundredthsOfSecond.value() == 0) {
            seconds.advance();
        }
    }

    @Override
    public String toString() {
        return this.seconds + ":" + hundredthsOfSecond;
    }
}

