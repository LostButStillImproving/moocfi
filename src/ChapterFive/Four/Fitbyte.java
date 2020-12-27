package ChapterFive.Four;

public class Fitbyte {


    int age;
    int restingHeartRate;
    double maximumHeartRate;

    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
        this.maximumHeartRate = 206.3 - (0.711 * this.age);
    }

    public double targetHeartRate(double percentageOfMaximum) {
        return (206.3 - (0.711 * this.age) - restingHeartRate) * (percentageOfMaximum) + restingHeartRate;
    }
}
