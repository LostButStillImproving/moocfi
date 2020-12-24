package ChapterFour.Fifteen;

public class Statistics {

    private int count;
    private int sum;

    public Statistics() {

        count = 0;
        sum = 0;

    }

    public void addNumber(int number) {
        this.count ++;
        this.sum += number;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        return (double) this.sum()/this.getCount();
    }
}
