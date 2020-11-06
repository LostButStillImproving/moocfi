package ChapterTwo.TwoPointEleven;

import java.util.Scanner;

public class NumberAndSumOfNumbers {

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

        System.out.println("Number of numbers: " + numberCount);
        System.out.println("Sum of the numbers: " + sum);
    }
}