package ChapterThree.Six;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        System.out.println("From where?");
        int from = Integer.valueOf(scanner.nextLine());
        System.out.println("To where?");
        int to = Integer.valueOf(scanner.nextLine());
        IntStream.rangeClosed(from, to).forEach(i-> System.out.println(numbers.get(i)));
    }
}
