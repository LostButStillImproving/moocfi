package ChapterTwo.TwoPointEighteen;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SumOfASequenceSequel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        int lowNumber = scanner.nextInt();
        System.out.println("Last number?");
        int topNumber = scanner.nextInt();
        System.out.println(IntStream.rangeClosed(lowNumber, topNumber).sum());


    }

}
