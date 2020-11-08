package ChapterThree.TwentyTwo;


import java.util.Arrays;
import java.util.stream.IntStream;

public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {

        for (int number:array
             ) {
            IntStream.rangeClosed(1, number).forEach(i -> System.out.print("*"));
            System.out.println();
        }

    }
}

