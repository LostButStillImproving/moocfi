package ChapterTwo.TwoPointTwelve;

import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numberCount = 0;
        int number;

        do {
            System.out.println("Give a number:");
            number = scanner.nextInt();
            if (number != 0) {
                sum += number;
                numberCount += 1;
            }

        } while (number != 0);

        System.out.println("Average of the numbers: " +  ((double) sum/numberCount));
    }
}