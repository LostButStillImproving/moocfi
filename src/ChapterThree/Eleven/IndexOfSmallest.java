package ChapterThree.Eleven;


import ChapterThree.Eight.IndexOf;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input == -1) {
                break;
            }
            list.add(input);
        }
        Integer min = list
                .stream()
                .mapToInt(v -> v)
                .min().orElseThrow(NoSuchElementException::new);


        ArrayList<Integer> indices = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == min){
                indices.add(i);
            }
        }


        System.out.println("Smallest number: " + min);
        indices.forEach(i -> System.out.println("Found at index: " + i));
    }
}
