package ChapterThree.TwentySix;

import java.util.Arrays;
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String input = scanner.nextLine();
            if (input.isEmpty()) break;
            Arrays.stream(input.split(" ")).forEach(System.out::println);
        }
    }
}
