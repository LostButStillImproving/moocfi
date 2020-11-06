package ChapterTwo.TwoPointTwentySix;

import java.util.stream.IntStream;

public class DivisibleByThree {

    public static void divisibleByThreeInRange(int beginning, int end) {
        IntStream.rangeClosed(beginning, end).filter( number -> number % 3 == 0).forEach(System.out::println);
    }

    public static void main(String[] args) {
        divisibleByThreeInRange(3, 6);
    }
}
