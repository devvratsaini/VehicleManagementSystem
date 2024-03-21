import java.util.Scanner;

public class EmailChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an email address: ");
        String enteredEmail = scanner.nextLine();

        if (checkEmailFormat(enteredEmail)) {
            System.out.println("Email format is correct.");
        } else {
            System.out.println("Email format is incorrect.");
        }

        scanner.close();
    }

    public static boolean checkEmailFormat(String email) {
        int atIndex = email.indexOf('@');
        int lastIndex = email.lastIndexOf('@');

        // Check if "@" is present, occurs only once, and is not at first or last index
        return atIndex != -1 && atIndex == lastIndex && atIndex != 0 && atIndex != email.length() - 1;
    }
}
