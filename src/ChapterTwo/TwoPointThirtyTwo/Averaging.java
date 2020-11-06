package ChapterTwo.TwoPointThirtyTwo;

public class Averaging {
    public static int sum(int number1, int number2, int number3, int number4) {
        // write your code here
        // remember to include return (at the end)!
        return number1+number2+number3+number4;
    }
    public static double average(int number1, int number2, int number3, int number4) {
        int sum = sum(number1, number2, number3, number4);
        return (double) sum / 4;
    }
}
