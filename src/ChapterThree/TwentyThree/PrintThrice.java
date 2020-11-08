package ChapterThree.TwentyThree;


import java.util.Scanner;
import java.util.stream.IntStream;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        IntStream.rangeClosed(0,2).forEach(i -> System.out.print(name));

    }
}
