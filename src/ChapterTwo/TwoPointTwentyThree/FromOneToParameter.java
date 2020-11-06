package ChapterTwo.TwoPointTwentyThree;

import java.util.stream.IntStream;

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }

    public static void printUntilNumber(int number) {
        IntStream.rangeClosed(1, number).forEach(System.out::println);
    }
}
