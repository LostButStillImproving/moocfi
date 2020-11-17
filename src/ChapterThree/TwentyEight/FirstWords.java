package ChapterThree.TwentyEight;


import java.util.Arrays;
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            String input = scanner.nextLine();
            if (input.isEmpty()) break;
            System.out.println(Arrays.stream(input.split(" ")).toArray()[0]);

        }
    }
}
