package ChapterTwo.TwoPointFifteen;

import java.util.Scanner;
import java.util.stream.IntStream;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minNumber = scanner.nextInt();
        IntStream.rangeClosed(minNumber, 100).forEach(System.out::println);

    }
}
