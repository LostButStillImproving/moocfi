package ChapterFour.Thirty;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) throws IOException {
        ArrayList<Person> persons = new ArrayList<>();
        try (Scanner scan = new Scanner(Path.of(file))) {
            while (scan.hasNextLine()) {
                String[] personData = scan.nextLine().split(",");
                persons.add(new Person(personData[0], Integer.parseInt(personData[1])));
            }
        }
        // Write here the code for reading from file
        // and printing the read records
        return persons;

    }
}
