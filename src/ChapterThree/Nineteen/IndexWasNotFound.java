package ChapterThree.Nineteen;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.print("Search for? ");
        int searching = Integer.valueOf(scanner.nextLine());
        // Implement the search functionality here
        if (Arrays.stream(array).anyMatch(i -> i == searching)) {
            List<Integer> list = Arrays.stream(array).sequential().boxed().collect(Collectors.toList());
            System.out.println(searching + " is at index " + list.indexOf(searching) + ".");
        } else {
            System.out.println(searching + " was not found.");
        }
    }

}
