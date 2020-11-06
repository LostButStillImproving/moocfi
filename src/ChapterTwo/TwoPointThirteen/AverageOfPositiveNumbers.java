package ChapterTwo.TwoPointThirteen;

import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numberCount = 0;
        int positiveNumbersCount = 0;
        int number;

        do {
            System.out.println("Give a number:");
            number = scanner.nextInt();
            if (number > 0) {
                sum += number;
                numberCount += 1;
                positiveNumbersCount += 1;
            }

        } while (number != 0);
        if (positiveNumbersCount == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(((double) sum/numberCount));
        }

    }
}