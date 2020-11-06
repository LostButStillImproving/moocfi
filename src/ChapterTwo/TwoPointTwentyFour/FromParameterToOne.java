package ChapterTwo.TwoPointTwentyFour;

import java.util.Collections;
import java.util.stream.IntStream;

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
    }

    public static void printFromNumberToOne(int number) {
        IntStream.rangeClosed(1, 5)
                                    .boxed()
                                    .sorted(Collections.reverseOrder())
                                    .forEach(System.out::println);
    }
}