package ChapterThree.Thirty;

import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = Integer.MIN_VALUE;

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) break;
            String[] inputArray = input.split(",");
            int age = Integer.parseInt(inputArray[1]);
            if (age > oldest) oldest = age;
        }
        System.out.println("Age of the oldest: " + oldest);

    }
}

