package ChapterThree.TwentyOne;


import java.util.Arrays;

public class PrintNeatly {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {82, 12, 105, 71, 116, 127, 0, 89, 94, 68, 52, 70, 97, 123, 113, 16, 108, 38, 31, 84, 149, 48, 50, 44, 45, 140, 145, 124, 30, 26, 71, 109, 30, 71, 41, 146, 136, 47, 130, 118, 113, 107, 69, 29, 100, 145, 37, 41, 22, 14, 134, 132, 88, 72, 31, 0, 6, 32, 89, 28, 55, 91, 53, 0, 133, 7, 1, 114, 72, 57, 110, 81, 47, 75, 51, 98, 31, 71, 67, 44, 6, 65, 119, 63, 61, 10, 16, 123, 2, 118, 129, 143, 9, 129, 130, 22, 148, 71, 144, 119};
        int[] array1 = {1};
        printNeatly(array1);
    }

    public static void printNeatly(int[] array) {
        //Arrays.stream(array).sequential().filter(i -> array[array.length-1] != i).forEach(i -> System.out.print(i + ", "));
        //System.out.println(array[array.length-1]);
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1)
            {
                System.out.print(array[i] + ", ");
            } else System.out.print(array[i]);

        }
    }
}
