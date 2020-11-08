package ChapterThree.Fifteen;


import java.util.ArrayList;
import java.util.stream.IntStream;

public class PrintInRange {

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        numbers.stream().filter(i -> i <= upperLimit && i >= lowerLimit).forEach(System.out::println);
    }

    public static void main(String[] args) {

    }
}
