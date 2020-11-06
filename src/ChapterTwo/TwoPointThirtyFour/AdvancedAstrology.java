package ChapterTwo.TwoPointThirtyFour;

import java.util.stream.IntStream;

public class AdvancedAstrology {
    public static void printSpaces(int number){
        IntStream.rangeClosed(1,number).forEach(i -> System.out.print(" "));
    }

    public static void printStars(int number) {
        IntStream.rangeClosed(1, number).forEach(i -> System.out.print("*"));
        System.out.println();
    }

    public static void printTriangle(int size){
        for (int i = size; i >= 0 ; i--) {
            printSpaces( i);
            printStars(size-i);
        }
    }

    public static void christmasTree(int height){
        int numberOfStars = 1;
        for (int i = 0; i < height; i++) {
            printSpaces(height-i);
            printStars(numberOfStars);
            numberOfStars += 2;
        }
        printSpaces( (numberOfStars-2)/2);
        printStars(3);
        printSpaces((numberOfStars-2)/2);
        printStars(3);

    }

    public static void main(String[] args) {
        christmasTree(2);
    }
}
