package ChapterFour.Twentyfour;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {


    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(Path.of("src/ChapterFour/Twentyfour/data.txt"))) {

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }

    }
}
