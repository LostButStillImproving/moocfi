package ChapterFour.Twentynine;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        System.out.println("");
        String fileName = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(Path.of(fileName))) {
            if (fileScanner.hasNextLine()) {
                String[] record = fileScanner.nextLine().split(",");

                System.out.println(record[0] + "age: " + record[1] + " years");
            }
        }

    }
}
