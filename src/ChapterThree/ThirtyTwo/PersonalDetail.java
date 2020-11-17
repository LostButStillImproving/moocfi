package ChapterThree.ThirtyTwo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Scanner;

public class PersonalDetail {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> birthyears = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) break;
            String[] inputArray = input.split(",");
            names.add(inputArray[0]);
            birthyears.add(Integer.parseInt(inputArray[1]));
        }
        names.sort(Comparator.comparingInt(String::length));
        IntSummaryStatistics yearsStats = birthyears.stream().mapToInt(Integer::intValue).summaryStatistics();
        Double average = yearsStats.getAverage();

        System.out.println("Longest name: " + names.get(names.size() - 1));
        System.out.println("Average of the birth years: " + average );

    }
}
