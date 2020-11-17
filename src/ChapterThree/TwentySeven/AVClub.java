package ChapterThree.TwentySeven;


import java.util.Arrays;
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String input = scanner.nextLine();
            if (input.isEmpty()) break;
            Arrays.stream(input.split(" ")).filter(i -> i.contains("av")).forEach(System.out::println);
        }

    }
}

