package ChapterThree.ThirtyOne;

import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = Integer.MIN_VALUE;
        String name = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) break;
            String[] inputArray = input.split(",");
            int age = Integer.parseInt(inputArray[1]);
            if (age > oldest){
                oldest = age;
                name = inputArray[0];
            }
        }
        System.out.println("Name of the oldest: " + name);

    }
}

