import java.util.Scanner;

public class password_checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] commonPasswords = {"password", "123456", "12345678", "qwerty", "abc123", "letmein", "welcome", "admin"};

        String rating = "";

        while (!rating.equals("Strong")) {
            System.out.print("Enter a password: ");
            String password = scanner.nextLine();

            boolean hasUpper = false;
            boolean hasLower = false;
            boolean hasNumber = false;
            boolean hasSymbol = false;
            boolean isCommon = false;
            int score = 0;

            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);

                if (Character.isUpperCase(c)) {
                    hasUpper = true;
                } else if (Character.isLowerCase(c)) {
                    hasLower = true;
                } else if (Character.isDigit(c)) {
                    hasNumber = true;
                } else {
                    hasSymbol = true;
                }
            }

            // Check the common passwords list
            for (int i = 0; i < commonPasswords.length; i++) {
                if (password.equalsIgnoreCase(commonPasswords[i])) {
                    isCommon = true;
                }
            }

            // Add up the score
            if (password.length() >= 8) {
                score++;
            }
            if (password.length() >= 12) {
                score++;
            }
            if (hasUpper) {
                score++;
            }
            if (hasLower) {
                score++;
            }
            if (hasNumber) {
                score++;
            }
            if (hasSymbol) {
                score++;
            }

            if (isCommon || score <= 2) {
                rating = "Weak";
            } else if (score <= 4) {
                rating = "Medium";
            } else {
                rating = "Strong";
            }

            System.out.println("Rating: " + rating);

            if (isCommon) {
                System.out.println("Tip: This is a very common password. Pick something unique.");
            }
            if (password.length() < 12) {
                System.out.println("Tip: Use at least 12 characters.");
            }
            if (!hasUpper) {
                System.out.println("Tip: Add an uppercase letter.");
            }
            if (!hasLower) {
                System.out.println("Tip: Add a lowercase letter.");
            }
            if (!hasNumber) {
                System.out.println("Tip: Add a number.");
            }
            if (!hasSymbol) {
                System.out.println("Tip: Add a symbol like ! or #.");
            }

            if (!rating.equals("Strong")) {
                System.out.println("Try again.\n");
            }
        }

        System.out.println("Your password is strong!");
        scanner.close();
    }
}
        scanner.close();
    }
}
