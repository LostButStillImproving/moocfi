package ChapterTwo.TwoPointTwenty;

import java.util.Scanner;

public class RepeatingBreakingandRemebering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int numberOfNumbers = 0;
        int even = 0;
        int uneven = 0;
        while(true){
            int number = scanner.nextInt();
            if (number == -1){
                break;
            } else {
                sum += number;
                numberOfNumbers++;
                if (number % 2 == 0) {
                    even++;
                } else uneven++;
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numberOfNumbers);
        System.out.println("Average: " + ((double) sum) / numberOfNumbers);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + uneven);
    }
}
