package ChapterTwo.TwoPointSixteen;

import java.util.Scanner;
import java.util.stream.IntStream;

public class WhereTo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNumber = scanner.nextInt();
        IntStream.rangeClosed(1, -10).forEach(System.out::println);
    }
}