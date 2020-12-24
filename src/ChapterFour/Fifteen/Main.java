package ChapterFour.Fifteen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        Statistics statisticsEven = new Statistics();
        Statistics statisticsUneven = new Statistics();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers:");
        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number != -1) {
                statistics.addNumber(number);

                if (number % 2 == 0) {
                    statisticsEven.addNumber(number);
                }
                if (number % 2 != 0) {
                    statisticsUneven.addNumber(number);
                }
            } else break;
        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + statisticsEven.sum());
        System.out.println("Sum of odd numbers: " + statisticsUneven.sum());
    }
}
