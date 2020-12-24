package ChapterThree.ThirtyOne;

import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(isNumericNoException("2323"));


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

    public static boolean isNumeric(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (java.lang.NumberFormatException ex) {
            return false;
        }
    }

    public static boolean isNumericNoException(String token) {


        if (token.contains("[^0-9.]")) {
            return true;
        }
        return false;
    }


}

