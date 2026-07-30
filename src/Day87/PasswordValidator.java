package Day87;

import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String password = sc.nextLine();

        boolean upper = false;
        boolean lower = false;
        boolean digit = false;
        boolean special = false;

        if (password.length() < 8) {
            System.out.println("Weak Password");
            return;
        }

        for (char ch : password.toCharArray()) {

            if (Character.isUpperCase(ch))
                upper = true;
            else if (Character.isLowerCase(ch))
                lower = true;
            else if (Character.isDigit(ch))
                digit = true;
            else
                special = true;
        }

        if (upper && lower && digit && special)
            System.out.println("Strong Password");
        else
            System.out.println("Weak Password");
    }
}