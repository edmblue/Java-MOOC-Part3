
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstUsername = "alex";
        String firstPassword = "sunshine";
        String secondUsername = "emma";
        String secondPassword = "haskell";

        System.out.print("Enter username: ");
        String usernameInput = scanner.nextLine();
        System.out.print("Enter password: ");
        String passwordInput = scanner.nextLine();

        if (usernameInput.equals(firstUsername) && passwordInput.equals(firstPassword) || usernameInput.equals(secondUsername) && passwordInput.equals(secondPassword)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password");
        }

    }
}
