

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your current password:");
        String currentPassword = scanner.nextLine();

        System.out.println("Re-enter your password:");
        String reEnteredPassword = scanner.nextLine();

        if (validatePasswords(currentPassword, reEnteredPassword)) {
            System.out.println("Passwords match.");
            
        } else {
            System.out.println("Passwords do not match. ");
        }

        scanner.close();
    }

    public static boolean validatePasswords(String password1, String password2) {
        return password1.equals(password2);
    }
}
