package ChapterFour.Twelve;

public class Gauge {
    private int value;

    public Gauge() {
        this.value = 0;
    }

    public void increase() {
        if(value == 5) return;
        value++;
    }

    public void decrease() {
        if ((value == 0)) return;
        value--;
    }

    public int value() {
        return value;
    }

    public boolean full() {
        return value == 5;
    }
}
