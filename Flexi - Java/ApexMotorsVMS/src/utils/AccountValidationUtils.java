package utils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AccountValidationUtils {

    // returns true if password is strong else false if password is weak
    public static boolean isPasswordValid(String password) {

        int len = password.length();

        if (len < 8) {  // minimum password length requirement not met
            return false;
        } else {
            // validation flags
            boolean hasLower=false,
                    hasUpper=false,
                    hasDigit=false,
                    hasSpChar=false;

            Set<Character> spChars = new HashSet<>(
                    Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*'));

            // checking all characters and setting necessary flags
            for (char ch :password.toCharArray()) {
                if (Character.isLowerCase(ch))
                    hasLower = true;
                if (Character.isUpperCase(ch))
                    hasUpper = true;
                if (Character.isDigit(ch))
                    hasDigit = true;
                if (spChars.contains(ch))
                    hasSpChar = true;
            }

            // return true if all flags are true (i.e., all requirements are satisfied)
            return hasLower && hasUpper && hasDigit && hasSpChar;
        }
    }
    
    // returns true if email is valid
    public static boolean isEmailValid(String email) {
        
        int atIndex = email.indexOf('@');
        int lastIndex = email.lastIndexOf('@');

        // Check if "@" is present, occurs only once, and is not at first or last index
        return atIndex != -1 && atIndex == lastIndex && atIndex != 0 && atIndex != email.length() - 1;
    }
}
