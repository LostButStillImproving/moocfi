package ChapterTwo.TwoPointSeventeen;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SumOfASequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int topNumber = scanner.nextInt();
        System.out.println(IntStream.rangeClosed(1, topNumber).sum());


    }

}
