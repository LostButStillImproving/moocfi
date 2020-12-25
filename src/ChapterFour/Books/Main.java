package ChapterFour.Books;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> listOfBooks = new ArrayList<>();
        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if(title.isEmpty()) break;
            System.out.println("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());
            System.out.println("Publication year: ");
            int year = Integer.parseInt(scanner.nextLine());
            listOfBooks.add(new Book(title, pages, year));
        }
        System.out.println("What information will be printed?");
        String whatToPrint = scanner.nextLine();
        if (whatToPrint.equals("everything")) {
            listOfBooks.forEach(b -> System.out.println(b.getTitle() + ", " + b.getPages() + ", " + b.getYear()));
        }

        if (whatToPrint.equals("name")) {
            listOfBooks.forEach(b -> System.out.println(b.getTitle()));
        }
    }
}
