package ChapterThree.TwentyNine;

import java.util.Arrays;
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            String input = scanner.nextLine();
            if (input.isEmpty()) break;
            String stream = Arrays.stream(input.split(" ")).reduce((first, last) -> last).orElse(null);
            System.out.println(stream);
        }
    }
}