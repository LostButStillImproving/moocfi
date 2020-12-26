package ChapterFour.Twentyeight;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.parseInt(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.parseInt(scanner.nextLine());
        int count = 0;
        try (Scanner scan = new Scanner(Path.of(file))) {
            while (scan.hasNext()) {
                int num = Integer.parseInt(scan.nextLine());
                if (num > lowerBound && num < upperBound) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
