package ChapterTwo.TwoPointTwentyTwo;

import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many times?");
        int numberOfTimes = scan.nextInt();
        while (numberOfTimes > 0) {
            printText();
            numberOfTimes--;
        }
    }


    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
