package ChapterFour.Thirtyone;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class SportsStatistics {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        System.out.println();
        String fileName = scan.nextLine();

        int count = 0;
        int wins = 0;
        int losses = 0;
        System.out.println("Team:");
        String team = scan.nextLine();

        try (Scanner fileScanner = new Scanner(Path.of("src/ChapterFour/Thirtyone/data.txt"))) {
            while (fileScanner.hasNextLine()) {
                String[] teamsOnly = fileScanner.nextLine().split(",");
                if (teamsOnly[0].equals(team) || teamsOnly[1].equals(team)) {
                    count++;

                    if (Integer.parseInt(teamsOnly[2]) < Integer.parseInt(teamsOnly[3]) && teamsOnly[1].equals(team)) {
                        wins++;
                    }
                    if (Integer.parseInt(teamsOnly[2]) > Integer.parseInt(teamsOnly[3]) && teamsOnly[1].equals(team)) {
                        losses++;
                    }

                    if (Integer.parseInt(teamsOnly[2]) > Integer.parseInt(teamsOnly[3]) && teamsOnly[0].equals(team)) {
                        wins++;
                    }
                    if (Integer.parseInt(teamsOnly[2]) < Integer.parseInt(teamsOnly[3]) && teamsOnly[0].equals(team)) {
                        losses++;
                    }
                }
            }

            System.out.println("Games: " + count);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        }
    }
}
