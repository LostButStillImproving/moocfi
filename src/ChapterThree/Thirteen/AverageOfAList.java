package ChapterThree.Thirteen;


import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // toteuta listan lukujen summan laskeminen tänne
        Double average = list.stream().mapToInt(Integer::intValue).average().orElseThrow(NoSuchElementException::new);
        System.out.println(average);
    }
}

