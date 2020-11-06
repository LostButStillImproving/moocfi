package ChapterTwo.TwoPointFourteen;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int topNumber = scanner.nextInt();
        IntStream.rangeClosed(0, topNumber).forEach(System.out::println);

    }
}
