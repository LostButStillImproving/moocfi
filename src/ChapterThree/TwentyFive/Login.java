package ChapterThree.TwentyFive;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        switch (username){
            case "alex" -> {
                if (password.equals("sunshine")) {
                    System.out.println("You have successfully logged in!");
                } else System.out.println("Incorrect username or password!");
            }
            case "emma" -> {
                if (password.equals("haskell")) {
                    System.out.println("You have successfully logged in!");
                } else System.out.println("Incorrect username or password!");
            }
            default -> System.out.println("Incorrect username or password");
        }
    }
}
