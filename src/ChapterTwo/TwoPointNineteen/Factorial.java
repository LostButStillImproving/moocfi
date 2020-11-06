package ChapterTwo.TwoPointNineteen;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int topNumber = scanner.nextInt();
        System.out.println(IntStream.rangeClosed(1, topNumber).reduce(1,  (a, b) -> a * b));
    }
}