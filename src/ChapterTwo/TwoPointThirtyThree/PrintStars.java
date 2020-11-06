package ChapterTwo.TwoPointThirtyThree;

import java.util.stream.IntStream;

public class PrintStars {

    public static void printStars(int number) {
        IntStream.rangeClosed(1, number).forEach(i -> System.out.print("*"));
        System.out.println();
    }

    public static void printSquare(int size) {
        IntStream.rangeClosed(1, size).forEach(i -> printStars(size));
    }

    public static void printRectangle(int width, int height){
        IntStream.rangeClosed(1, height).forEach(i -> printStars(width));
    }

    public static void printTriangle(int size){
        IntStream.rangeClosed(1, size).forEach(i -> printStars(i));

    }
}
